package irvine.oeis.a098;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A098891 Define the n-omino graph to be the graph whose vertices are each of the n-ominoes, two of which are joined by an edge if one can be obtained from the other by cutting out one of the latter's component squares (thus obtaining an (n-1)-omino for most cases) and gluing it elsewhere. The sequence counts the edges in these graphs.
 * @author Sean A. Irvine
 */
public class A098891 implements Sequence {

  private final List<Animal> mAnimals = Collections.synchronizedList(new ArrayList<>());
  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal)) {
            mAnimals.add(Canons.freeCanon(animal));
          }
        });
      }
    }
  );

  private int mN = 0;

  @Override
  public Z next() {
    mAnimals.clear();
    mHunter.count(++mN); // computes mAnimals
    int polyNumber = -1; // Distinct number assigned to each original polyomino

    // We are going to delete one cell out of each polyomino in each possible way.
    // The following map keeps track of the resulting pseudo-polyominoes and which
    // original polyominoes reduced to it.
    final HashMap<Animal, BitSet> b = new HashMap<>();

    // Consider each polyomino in turn
    synchronized (mAnimals) { // Not strictly needed since hunting is done by this time
      for (final Animal p : mAnimals) {
        ++polyNumber;
        // Delete each cell in turn
        for (int k = 0; k < p.size(); ++k) {
          final Animal canonical = Canons.freeCanon(p.remove(k));
          // At this point "canonical" need not be a proper polyomino (e.g. it might be disconnected)
          // but it will always be the same one up to the usual symmetry requirements
          final BitSet set = b.get(canonical);
          if (set != null) {
            set.set(polyNumber);
          } else {
            final BitSet s = new BitSet();
            s.set(polyNumber);
            b.put(canonical, s);
          }
        }
      }
    }

    // Now form the set of edges in the n-graph
    // If two different polyominoes reduce to the same pseudo-polyomino, then they
    // should be linked by an edge in the graph we are constructing.  We need to be
    // a little careful, because some edges will appear more than once, so do this
    // whole calculation using a set of Points (here representing edges).
    final HashSet<Point> edges = new HashSet<>();
    for (final BitSet s : b.values()) {
      for (int k = s.nextSetBit(0); k >= 0; k = s.nextSetBit(k + 1)) {
        for (int j = s.nextSetBit(k + 1); j >= 0; j = s.nextSetBit(j + 1)) {
          edges.add(new Point(k, j));
        }
      }
    }

    // Finally we have the answer, the total number of edges.
    return Z.valueOf(edges.size());
  }

}
