package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060677 Number of linear n-celled polyominoes, those with the property that a line can be drawn that intersects the interior of every cell.
 * @author Sean A. Irvine
 */
public class A060677 extends Sequence1 {

  // If an animal is linear, then there exists an animal with one less cell
  // which is also linear. Hence, we can forward generate for a single cell.
  // In fact, we can always extend either by taking the last point and
  // increasing x or y by one cell.  However, we do need to avoid generating
  // symmetric duplicates.
  //

  private static final Lattice L = Lattices.Z2;
  private List<Animal> mAnimals = new ArrayList<>();

  private boolean isLinearA(final Animal animal, final double m, final double b) {
    for (final long pt : animal.points()) {
      final long x = L.ordinate(pt, 0);
      final long y = L.ordinate(pt, 1);
      if (Math.floor(m * x + b) != y && Math.floor(m * (x + 1) + b) != y) {
//        if (animal.size() == 8 && animal.toString(L).equals("(0,0),(1,0),(2,0),(2,1),(3,1),(3,2),(4,2),(5,2)")) {
//          System.out.println("Rejecting: " + animal.toString(L) + " at x=" + x + " with y = " + m + " * x + " + b);
//        }
        return false;
      }
    }
    //System.out.println("Accepting: " + animal.toString(L));
    return true;
  }

  private static final double EPS = 1E-8; //100 * Double.MIN_NORMAL;
  //private static final double[] DELTA_X = {EPS, EPS, 1 - EPS, 1 - EPS};
  private static final double[] DELTA_X = {0, 0, 1, 1};
  private static final double[] DELTA_Y = {EPS, 1 - EPS, EPS, 1 - EPS};

  private boolean isLinear(final Animal animal) {
    final long[] pts = animal.points();
    final long tx = L.ordinate(pts[pts.length - 1], 0);
    final long ty = L.ordinate(pts[pts.length - 1], 1);
    // Try making lines for each corner of origin to each corner of (tx, ty)
    for (int k = 0; k < DELTA_X.length; ++k) {
      for (int j = 0; j < DELTA_X.length; ++j) {
        final double dx = tx + DELTA_X[j] - DELTA_X[k];
        final double dy = ty + DELTA_Y[j] - DELTA_Y[k];
        final double m = dy / dx;
        final double b = DELTA_Y[k] - m * DELTA_X[k];
        if (isLinearA(animal, m, b)) {
          return true;
        }
      }
    }
    // Try a harder search picking points all over start and end cells
    final double prec = 0.1;
    for (double k = prec; k < 1; k += prec) {
      for (double j = prec; j < 1; j += prec) {
        for (double l = prec; l < 1; l += prec) {
          for (double i = prec; i < 1; i += prec) {
            final double dx = tx + k - l;
            final double dy = ty + j - i;
            final double m = dy / dx;
            final double b = j - m * k;
            if (isLinearA(animal, m, b)) {
              return true;
            }
          }
        }
      }
    }
    System.out.println("Final rejection for: " + animal.toString(L));
    return false;
  }

  @Override
  public Z next() {
    if (mAnimals.isEmpty()) {
      mAnimals.add(new Animal(L.origin()));
    } else {
      // Track canons separately from the main list, because the canonicalization
      // procedure can mess with the order in which points are added.
      final HashSet<Animal> canons = new HashSet<>();
      final List<Animal> linearAnimals = new ArrayList<>();
      for (final Animal animal : mAnimals) {
        final long pt = animal.points()[animal.size() - 1];
        final long x = L.ordinate(pt, 0);
        final long y = L.ordinate(pt, 1);
        final Animal a = new Animal(animal, L.toPoint(x + 1, y));
        if (isLinear(a)) {
          canons.add(L.freeCanonical(a));
          linearAnimals.add(a);
        }
        final Animal b = new Animal(animal, L.toPoint(x, y + 1));
        if (isLinear(b)) {
          canons.add(L.freeCanonical(b));
          linearAnimals.add(b);
        }
      }
      mAnimals = linearAnimals;
      return Z.valueOf(canons.size());
    }
    return Z.valueOf(mAnimals.size());
  }
}
