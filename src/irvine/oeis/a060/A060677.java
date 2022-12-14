package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

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

  private static final Lattice L = Lattices.Z2;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private List<Animal> mAnimals = new ArrayList<>();

  private static String toTikz(final long x, final long y, final String modifier) {
    return "\\draw" + modifier + " (" + x + "," + y + ") -- (" + (x + 1) + "," + y + ") -- (" + (x + 1) + "," + (y + 1) + ") -- (" + x + "," + (y + 1) + ") -- cycle;";
  }

  private static String toTikz(final Animal animal, final CR m, final CR b, final long tx) {
    final StringBuilder sb = new StringBuilder();
    sb.append("\\arabic{cnt}.\\addtocounter{cnt}{1}\\begin{tikzpicture}[scale=0.25]");
    for (final long point : animal.points()) {
      final long x = L.ordinate(point, 0);
      final long y = L.ordinate(point, 1);
      sb.append(toTikz(x, y, "[fill=lightgray]")).append(toTikz(x, y, ""));
    }
    if (m != null) {
      sb.append("\\clip(0,0) rectangle (")
        .append(tx + 1)
        .append(",")
        .append(animal.extent(L, 1) + 1)
        .append("); ")
        .append("\\draw[color=red](0,")
        .append(DoubleUtils.NF5.format(b.doubleValue()))
        .append(") -- (")
        .append(tx + 1)
        .append(',')
        .append(DoubleUtils.NF5.format(m.multiply(tx + 1).add(b)))
        .append(");");
    }
    sb.append("\\end{tikzpicture}");
    return sb.toString();
  }

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

  private boolean isLinearA(final Animal animal, final CR m, final CR b) {
    for (final long pt : animal.points()) {
      final long x = L.ordinate(pt, 0);
      final long y = L.ordinate(pt, 1);
      if (m.multiply(x).add(b).floor().intValueExact() != y && m.multiply(x + 1).add(b).floor().intValueExact() != y) {
        return false;
      }
    }
    //System.out.println("Accepting: " + animal.toString(L));
    return true;
  }

  private static final double EPS = 1E-6; //100 * Double.MIN_NORMAL;
  //private static final double[] DELTA_X = {EPS, EPS, 1 - EPS, 1 - EPS};
  private static final double[] DELTA_X = {0, 0, 1, 1};
  private static final double[] DELTA_Y = {EPS, 1 - EPS, EPS, 1 - EPS};

  private CR[] isLinear(final Animal animal) {
    final long[] pts = animal.points();
    final long tx = L.ordinate(pts[pts.length - 1], 0);
    final long ty = L.ordinate(pts[pts.length - 1], 1);

    // Deal with trivial case of a straight line (makes the picture nicer)
    if (ty == 0 || tx == 0) {
      return new CR[] {CR.ZERO, CR.HALF};
    }

    // todo the following is much smarter -- but doesn't deal with the missing problem at 10
    if (animal.size() >= 5 /*&& animal.toString(L).equals("(0,0),(0,1),(1,1),(2,1),(2,2),(3,2),(4,2),(4,3),(5,3),(5,4)")*/) {
      final long x1 = L.ordinate(pts[1], 0);
      final long y1 = L.ordinate(pts[1], 1);
      final long xm1 = L.ordinate(pts[pts.length - 2], 0);
      final long ym1 = L.ordinate(pts[pts.length - 2], 1);
      if (x1 == 0 && ym1 == ty) {
        // #   ---> ##
        // #

        // L
        double ml = 0;
        double bl = 1;
        // H
        double mh = 1;
        double bh = 1;
        for (int k = 1; k < pts.length; ++k) {
          final long xk = L.ordinate(pts[k], 0);
          final long yk = L.ordinate(pts[k], 1);
          if (xk > 1 && ml * xk + bl < yk) {
            // Slope of L needs to be revised up
            ml = (yk - 1) / (double) (xk - 1);
            bl = -ml;
          }
          if (mh * xk + bh > yk) {
            // Slope of H needs to be revised down
            mh = yk / (double) xk;
            bh = 1;
          }
          System.out.println(animal.toString(L) + " L: " + k + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl));
          System.out.println(animal.toString(L) + " H: " + k + " " + DoubleUtils.NF5.format(mh) + "x+" + DoubleUtils.NF5.format(bh));
        }
        final double mf = 0.5 * (ml + mh);
        final double bf = 0.5 * (bl + bh);
        System.out.println(((isLinearA(animal, mf, bf)) ? "ACCEPTED: " : "REJECTED: ") + animal.toString(L) + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl) + " (" + DoubleUtils.NF5.format(ml * tx + bl) + " cf. " + DoubleUtils.NF5.format(mh * tx + bh) + ")");
        if (isLinearA(animal, mf, bf)) {
          return new CR[] {CR.valueOf(mf), CR.valueOf(bf)};
        }
//        if (ml * tx + bl > mh * tx + bh) {
//          return null;
//        }
//        return new CR[] {CR.valueOf(ml), CR.valueOf(bl)};
      }
      if (x1 == 0 && ym1 != ty) {
        //          #
        // #   ---> #
        // #
        System.out.println("Case 2");

        // L
        double ml = 0;
        double bl = 1;
        // H
        double mh = 1;
        double bh = 1;
        for (int k = 1; k < pts.length; ++k) {
          final long xk = L.ordinate(pts[k], 0);
          final long yk = L.ordinate(pts[k], 1);
          if (xk > 1) {
            if (ml * xk + bl < yk) {
              // Slope of L needs to be revised up
              ml = (yk - 1) / (double) xk;
              bl = 1 - ml;
            }
            if (mh * xk + bh > yk + 1) {
              // Slope of H needs to be revised down
              mh = yk / (double) xk;
              bh = 1;
            }
          }
          System.out.println(animal.toString(L) + " L: " + k + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl));
          System.out.println(animal.toString(L) + " H: " + k + " " + DoubleUtils.NF5.format(mh) + "x+" + DoubleUtils.NF5.format(bh));
        }
        final double mf = 0.5 * (ml + mh);
        final double bf = 0.5 * (bl + bh);
        System.out.println(((isLinearA(animal, mf, bf)) ? "ACCEPTED: " : "REJECTED: ") + animal.toString(L) + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl) + " (" + DoubleUtils.NF5.format(ml * tx + bl) + " cf. " + DoubleUtils.NF5.format(mh * tx + bh) + ")");
        if (isLinearA(animal, mf, bf)) {
          return new CR[] {CR.valueOf(mf), CR.valueOf(bf)};
        }
//        if (ml * tx + bl > mh * tx + bh) {
//          return null;
//        }
      }
      if (x1 != 0 && ym1 != ty) {
        //           #
        // ##   ---> #

        // L
        double ml = 0;
        double bl = 0;
        // H
        double mh = 0;
        double bh = 1;
        for (int k = 1; k < pts.length; ++k) {
          final long xk = L.ordinate(pts[k], 0);
          final long yk = L.ordinate(pts[k], 1);
          if (xk > 1) {
            if (ml * xk + bl < yk) {
              // Slope of L needs to be revised up
              ml = yk / (double) (xk - 1);
              bl = -ml;
            }
            if (mh * xk + bh > yk + 1) {
              // Slope of H needs to be revised down
              mh = (yk - 1) / (double) xk;
              bh = -mh;
            }
          }
          System.out.println(animal.toString(L) + " L: " + k + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl));
          System.out.println(animal.toString(L) + " H: " + k + " " + DoubleUtils.NF5.format(mh) + "x+" + DoubleUtils.NF5.format(bh));
        }
        final double mf = 0.5 * (ml + mh);
        final double bf = 0.5 * (bl + bh);
        System.out.println(((isLinearA(animal, mf, bf)) ? "ACCEPTED: " : "REJECTED: ") + animal.toString(L) + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl) + " (" + DoubleUtils.NF5.format(ml * tx + bl) + " cf. " + DoubleUtils.NF5.format(mh * tx + bh) + ")");
        if (isLinearA(animal, mf, bf)) {
          return new CR[] {CR.valueOf(mf), CR.valueOf(bf)};
        }
//        if (ml * tx + bl > mh * tx + bh) {
//          return null;
//        }
      }
      if (x1 != 0 && ym1 == ty) {
        //           ##
        // ##   --->

        // L
        double ml = 0;
        double bl = 0;
        // H
        double mh = 0;
        double bh = 1;
        for (int k = 1; k < pts.length; ++k) {
          final long xk = L.ordinate(pts[k], 0);
          final long yk = L.ordinate(pts[k], 1);
          if (xk > 1) {
            if (ml * xk + bl < yk) {
              // Slope of L needs to be revised up
              ml = yk / (double) (xk - 1);
              bl = -ml;
            }
            if (mh * xk + bh > yk + 1) {
              // Slope of H needs to be revised down
              mh = yk / (double) (xk - 1);
              bh = -mh;
            }
          }
          System.out.println(animal.toString(L) + " L: " + k + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl));
          System.out.println(animal.toString(L) + " H: " + k + " " + DoubleUtils.NF5.format(mh) + "x+" + DoubleUtils.NF5.format(bh));
        }
        final double mf = 0.5 * (ml + mh);
        final double bf = 0.5 * (bl + bh);
        System.out.println(((isLinearA(animal, mf, bf)) ? "ACCEPTED: " : "REJECTED: ") + animal.toString(L) + " " + DoubleUtils.NF5.format(ml) + "x+" + DoubleUtils.NF5.format(bl) + " (" + DoubleUtils.NF5.format(ml * tx + bl) + " cf. " + DoubleUtils.NF5.format(mh * tx + bh) + ")");
        if (isLinearA(animal, mf, bf)) {
          return new CR[] {CR.valueOf(mf), CR.valueOf(bf)};
        }
//        if (ml * tx + bl > mh * tx + bh) {
//          return null;
//        }
      }
    }


    // Try making lines for each corner of origin to each corner of (tx, ty)
    for (int k = 0; k < DELTA_X.length; ++k) {
      for (int j = 0; j < DELTA_X.length; ++j) {
        final double dx = tx + DELTA_X[j] - DELTA_X[k];
        final double dy = ty + DELTA_Y[j] - DELTA_Y[k];
        final double m = dy / dx;
        if (Double.isFinite(m)) {
          final double b = DELTA_Y[k] - m * DELTA_X[k];
          if (isLinearA(animal, CR.valueOf(m), CR.valueOf(b))) {
            return new CR[] {CR.valueOf(m), CR.valueOf(b)};
          }
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
            if (Double.isFinite(m)) {
              final double b = j - m * k;
              if (isLinearA(animal, CR.valueOf(m), CR.valueOf(b))) {
                return new CR[] {CR.valueOf(m), CR.valueOf(b)};
              }
            }
          }
        }
      }
    }
    return null;
  }

  @Override
  public Z next() {
    if (mAnimals.isEmpty()) {
      mAnimals.add(new Animal(L.origin()));
      if (mVerbose) {
        StringUtils.message("\\section*{$n=1$}");
        StringUtils.message("\\setcounter{cnt}{1}");
        StringUtils.message("\\arabic{cnt}.\\addtocounter{cnt}{1}\\begin{tikzpicture}[scale=0.25]\\draw[fill=lightgray] (0,0) -- (1,0) -- (1,1) -- (0,1) -- cycle;\\draw (0,0) -- (1,0) -- (1,1) -- (0,1) -- cycle;\\clip(0,0) rectangle (1,1); \\draw[color=red](0,0.5) -- (1,0.5);\\end{tikzpicture}");
      }
      return Z.ONE;
    } else {
      // Track canons separately from the main list, because the canonicalization
      // procedure can mess with the order in which points are added.
      if (mVerbose) {
        StringUtils.message("\\section*{$n=" + (mAnimals.get(0).size() + 1) + "$}");
        StringUtils.message("\\setcounter{cnt}{1}");
      }
      final HashSet<Animal> canons = new HashSet<>();
      final List<Animal> linearAnimals = new ArrayList<>();
      for (final Animal animal : mAnimals) {
        final long pt = animal.points()[animal.size() - 1];
        final long x = L.ordinate(pt, 0);
        final long y = L.ordinate(pt, 1);
        final Animal a = new Animal(animal, L.toPoint(x + 1, y));
        final CR[] la = isLinear(a);
        if (la != null) {
          if (canons.add(L.freeCanonical(a)) && mVerbose) {
            StringUtils.message(toTikz(a, la[0], la[1], x + 1));
          }
          linearAnimals.add(a);
        } else if (mVerbose && a.size() == 10) {
          if (!canons.contains(L.freeCanonical(a))) {
            StringUtils.message(toTikz(a, null, null, 0));
          }
        }
        final Animal b = new Animal(animal, L.toPoint(x, y + 1));
        final CR[] lb = isLinear(b);
        if (lb != null) {
          if (canons.add(L.freeCanonical(b)) && mVerbose) {
            StringUtils.message(toTikz(b, lb[0], lb[1], x));
          }
          linearAnimals.add(b);
        } else if (mVerbose && b.size() == 10) {
          if (!canons.contains(L.freeCanonical(b))) {
            StringUtils.message(toTikz(b, null, null, 0));
          }
        }
      }
      mAnimals = linearAnimals;
      return Z.valueOf(canons.size());
    }
  }
}
