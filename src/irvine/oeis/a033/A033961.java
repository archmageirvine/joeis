package irvine.oeis.a033;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A033961.
 * @author Sean A. Irvine
 */
public class A033961 implements Sequence {

  // todo odd cases is working, even is not

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

  private boolean ok(final long v, final List<Point> pts, final HashMap<Point, Long> lambda, final int i) {
    long t = v;
    for (final Point p : pts) {
      t += zeta(p.left(), p.right(), i) * lambda.get(p);
    }
    return t >= 0;
  }

  private boolean bump(final List<Point> pts, final HashMap<Point, Long> lambda) {
    for (int k = 0; k < pts.size(); ++k) {
      final Point p = pts.get(k);
      final int a = p.left();
      final int b = p.right();
      final int lim = (mN + 2) / (a + b + 2);
      final long v = lambda.get(p);
      if (v < lim) {
        lambda.put(p, v + 1);
        return true;
      }
      lambda.put(p, 0L);
    }
    return false;
  }

  private Z count(final List<Point> allowed,  final HashMap<Point, Long> lambda, final int i) {
    if (i > (mN - 3) / 2) {
      return Z.ONE;
    }
    // Determine the variables for Eq (4) at given i
    long v = 2;
    final List<Point> pts = new ArrayList<>();
    for (final Point p : allowed) {
      final long zeta = zeta(p.left(), p.right(), i);
      final Long fix = lambda.get(p);
      if (fix != null) {
        v += zeta * fix;
      } else if (zeta != 0) {
        pts.add(p);
        lambda.put(p, 0L);
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

  private void dumpEqns(final List<Point> allowed,  final HashMap<Point, Long> lambda) {
    final long[] v = new long[(mN - 3) / 2 + 1];
    Arrays.fill(v, 2);
    final List<List<Point>> eqn = new ArrayList<>();
    eqn.add(null);
    eqn.add(null);
    for (int i = 2; i <= (mN - 3) / 2; ++i) {
      final List<Point> pts = new ArrayList<>();
      eqn.add(pts);
      final StringBuilder sb = new StringBuilder("2");
      for (final Point p : allowed) {
        final long zeta = zeta(p.left(), p.right(), i);
        final Long fix = lambda.get(p);
        if (fix != null) {
          v[i] += zeta * fix;
        } else if (zeta != 0) {
          pts.add(p);
        }
        if (zeta != 0) {
          if (zeta > 0) {
            sb.append('+');
            if (zeta > 1) {
              sb.append(zeta);
            }
            sb.append(p);
          } else {
            sb.append('-');
            if (zeta < -1) {
              sb.append(-zeta);
            }
            sb.append(p);
          }
        }
      }
      System.out.println("Eqn(" + i + ") -> " + sb.toString());
    }
    System.out.println("Reduced equations (note the zeta terms not included here:");
    for (int k = 2; k < v.length; ++k) {
      System.out.println(v[k] + " " + eqn.get(k));
    }
  }

  @Override
  public Z next() {
    ++mN;
    System.out.println("n=" + mN);
    final HashMap<Point, Long> lambda = new HashMap<>();
    Z sum = Z.ZERO;

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
      for (int a = 1; 2 * a <= mN - 1 - a; ++a) {
        for (int b = a; 2 * b <= mN - 1 - a; ++b) {
          if (a + b >= (mN - 1) / 2) {
            subAllowed.add(new Point(a, b));
          }
        }
      }

      // Using the last equation from (4) we choose exactly one lambda to be 1
      for (int k = -1; k < subAllowed.size(); ++k) { // -1 lets all variables be 0
        for (int j = 0; j < subAllowed.size(); ++j) {
          lambda.put(subAllowed.get(j), j == k ? 1L : 0L);
        }
        //dumpEqns(allowed, lambda);
        sum = sum.add(count(allowed, lambda, 2));
      }
    } else {
      // even

      // Compute all allowed variables lambda_{a,b}
      final ArrayList<Point> subAllowed = new ArrayList<>();
      for (int a = 1; 2 * a <= mN - 1 - a; ++a) {
        for (int b = a; 2 * b <= mN - 1 - a; ++b) {
          if (a + b >= mN / 2) {
            subAllowed.add(new Point(a, b));
          }
        }
      }

      // Choose single variable from second set
      for (int k = -1; k < subAllowed.size(); ++k) { // -1 lets all variables be 0
        for (int j = 0; j < subAllowed.size(); ++j) {
          lambda.put(subAllowed.get(j), j == k ? 1L : 0L);
        }
        //dumpEqns(allowed, lambda);
        sum = sum.add(count(allowed, lambda, 2));
      }

      subAllowed.clear();
      for (int a = 1; 2 * a <= mN - 1 - a; ++a) {
        for (int b = a; 2 * b <= mN - 1 - a; ++b) {
          if (a + b == mN / 2 - 1) {
            subAllowed.add(new Point(a, b));
          }
        }
      }

      // Choose one or two of them k and j
      for (int k = -1; k < subAllowed.size(); ++k) { // -1 allows for a 0
        for (int j = k + 1; j < subAllowed.size(); ++j) {
          for (int i = 0; i < subAllowed.size(); ++i) {
            lambda.put(subAllowed.get(i), i == k || i == j ? 1L : 0L);
          }
        }
        //dumpEqns(allowed, lambda);
        sum = sum.add(count(allowed, lambda, 2));
      }

    }

    return sum;
  }
}
