package irvine.oeis.a033;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Point;

/**
 * A033961 Number of different sets ("cut sets") of triangles a regular (n+2)-gon can be dissected into; two triangulations of an (n+2)-gon are equal if all numbers of congruent triangles coincide.
 * @author Sean A. Irvine
 */
public class A033961 extends Sequence2 {

  // See Iuliana Dochkova-Todorova, "Computer Methods and New Values for Cut Set Catalan Numbers"

  private int mN = 1;

  private long zeta(final int a, final int b, final int i) {
    if (a <= i && b > i) {
      return 0;
    }
    if (a + b <= i - 1) {
      return 0;
    }
    if (a >= i + 1) {
      return 1;
    }
    if (a <= i && b <= i && i <= a + b && a + b < mN - 1 - i) {
      return -1;
    }
    if (a <= i && b <= i && a + b >= mN - 1 - i) {
      return -2;
    }
    throw new RuntimeException();
  }

  private boolean ok(final long v, final List<Point> pts, final HashMap<Point, Integer> lambda, final int i) {
    long t = v;
    for (final Point p : pts) {
      t += zeta(p.left(), p.right(), i) * lambda.get(p);
    }
    return t >= 0;
  }

  private boolean bump(final List<Point> pts, final HashMap<Point, Integer> lambda) {
    for (final Point p : pts) {
      final int a = p.left();
      final int b = p.right();
      final int lim = (mN + 2) / (a + b + 2);
      final int v = lambda.get(p);
      if (v < lim) {
        lambda.put(p, v + 1);
        return true;
      }
      lambda.put(p, 0);
    }
    return false;
  }

  private Z count(final List<Point> allowed, final HashMap<Point, Integer> lambda, final int i) {
    if (i > (mN - 3) / 2) {
      return Z.ONE;
    }
    // Determine the variables for Eq (4) at given i
    long v = 2;
    final List<Point> pts = new ArrayList<>();
    for (final Point p : allowed) {
      final long zeta = zeta(p.left(), p.right(), i);
      final Integer fix = lambda.get(p);
      if (fix != null) {
        v += zeta * fix;
      } else if (zeta != 0) {
        pts.add(p);
        lambda.put(p, 0);
      }
    }
    //System.out.println(i + " " + v + " " + pts);
    Z sum = Z.ZERO;

    // Try each possible assignment
    do {
      if (ok(v, pts, lambda, i)) {
        sum = sum.add(count(allowed, lambda, i + 1));
      }
    } while (bump(pts, lambda));

    // Remove variables introduced by this equation
    for (final Point p : pts) {
      lambda.remove(p);
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final HashMap<Point, Integer> lambda = new HashMap<>();
    final ArrayList<Point> allowed = new ArrayList<>();
    for (int a = 1; 2 * a <= mN - 1 - a; ++a) {
      for (int b = a; 2 * b <= mN - 1 - a; ++b) {
        allowed.add(new Point(a, b));
      }
    }

    if ((mN & 1) == 1) {
      // odd

      // Compute all allowed variables lambda_{a,b}
      final ArrayList<Point> subAllowed = new ArrayList<>();
      for (final Point p : allowed) {
        if (p.left() + p.right() >= (mN - 1) / 2) {
          subAllowed.add(p);
        }
      }

      // Using the last equation from (4) we choose zero or one lambda variable to be 1
      for (int k = -1; k < subAllowed.size(); ++k) { // -1 lets all variables be 0
        for (int j = 0; j < subAllowed.size(); ++j) {
          lambda.put(subAllowed.get(j), j == k ? 1 : 0);
        }
        sum = sum.add(count(allowed, lambda, 2));
      }
    } else {
      // even

      // Compute all allowed variables lambda_{a,b}
      final ArrayList<Point> subAllowed1 = new ArrayList<>();
      for (final Point p : allowed) {
        if (p.left() + p.right() == mN / 2 - 1) {
          subAllowed1.add(p);
        }
      }
      final ArrayList<Point> subAllowed2 = new ArrayList<>();
      for (final Point p : allowed) {
        if (p.left() + p.right() >= mN / 2) {
          subAllowed2.add(p);
        }
      }

      // Choose single variable from second set
      for (final Point p : subAllowed1) {
        lambda.put(p, 0);
      }
      for (int k = -1; k < subAllowed2.size(); ++k) { // -1 lets all variables be 0
        for (int j = 0; j < subAllowed2.size(); ++j) {
          lambda.put(subAllowed2.get(j), j == k ? 1 : 0);
        }
        sum = sum.add(count(allowed, lambda, 2));
      }

      // Choose two variables from first set of them k and j
      for (final Point p : subAllowed2) {
        lambda.put(p, 0);
      }
      for (int k = 0; k < subAllowed1.size() - 1; ++k) { // set two variables
        for (int j = k + 1; j < subAllowed1.size(); ++j) {
          for (int i = 0; i < subAllowed1.size(); ++i) {
            lambda.put(subAllowed1.get(i), i == k || i == j ? 1 : 0);
          }
          sum = sum.add(count(allowed, lambda, 2));
        }
      }

      // Choose single variable from first set and assign it 1 or 2
      for (int v = 1; v <= 2; ++v) {
        for (int k = 0; k < subAllowed1.size(); ++k) { // Set one variable to v
          for (int i = 0; i < subAllowed1.size(); ++i) {
            lambda.put(subAllowed1.get(i), i == k ? v : 0);
          }
          sum = sum.add(count(allowed, lambda, 2));
        }
      }
    }

    return sum;
  }
}
