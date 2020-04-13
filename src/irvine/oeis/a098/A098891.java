package irvine.oeis.a098;

import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.a000.A000105;
import irvine.util.Point;

/**
 * A000105 Number of free polyominoes (or square animals) with n cells.
 * @author Sean A. Irvine
 */
public class A098891 extends A000105 {

  {
    super.next(); // skip size 0 polyominoes
  }

  @Override
  public Z next() {
    super.next(); // Generate all polyominoes of order n

    int polyNumber = -1; // Distinct number assigned to each original polyomino

    // We are going to delete one cell out of each polyomino in each possible way.
    // The following map keeps track of the resulting pseudo-polyominoes and which
    // original polyominoes reduced to it.
    final HashMap<Polyomino, BitSet> b = new HashMap<>();

    // Consider each polyomino in turn
    for (final Polyomino p : mA) {
      ++polyNumber;
      // Delete each cell in turn
      for (final Point pt : p) {
        final Polyomino reduced = new Polyomino(p);
        reduced.remove(pt);
        final Polyomino canonical = reduced.freeCanonical();
        // At this point "canonical" need not be a proper polyomino (e.g. it might be disconnected)
        // but it will always be the same one up to the usually symmetry requirements
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
