package irvine.oeis.a391;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A391453 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A391453 extends Sequence1 {

  // After Janaka Rodrigo

  private static int trapezoidPQ(final int q, final int f) {
    return q * (f + q - 1);
  }

  private static Set<String> aa1(final int n) {
    final HashSet<String> res = new HashSet<>();
    for (int h = 1; h < n; ++h) {
      for (int k = 1; k + h < n; ++k) {
        for (int a = 1; a < k; ++a) {
          for (int b = a + 1; b < k; ++b) {
            final int uq = k - b;
            if (uq <= 0) {
              continue;
            }
            final int uf = 2 * (n - k - h) + 1;
            if (uf <= 0) {
              continue;
            }
            final int wq = n - h - k;
            if (wq <= 0) {
              continue;
            }
            final int vf = 2 * (k - b) + 1;
            if (vf <= 0) {
              continue;
            }
            final TreeSet<Point> trapezoids = new TreeSet<>();
            trapezoids.add(new Point(a * (2 * (n - a) + a), a));
            trapezoids.add(new Point((b - a) * (2 * (n - b) + (b - a)), b - a));
            trapezoids.add(new Point(trapezoidPQ(uq, uf), uq));
            trapezoids.add(new Point(trapezoidPQ(wq, 2 * h + 1), wq));
            trapezoids.add(new Point(trapezoidPQ(h, vf), h));
            if (trapezoids.size() == 5) {
              res.add(trapezoids.toString());
            }
          }
        }
      }
    }
    return res;
  }


  private static Set<String> aa2(final int n) {
    final HashSet<String> res = new HashSet<>();
    for (int h = 1; h < n; ++h) {
      for (int k = 1; k + h < n; ++k) {
        for (int a = 1; a < k; ++a) {
          for (int b = a + 1; b < k; ++b) {
            final int qV = n - h - k;
            if (qV <= 0) {
              continue;
            }
            final int qT = k - b;
            if (qT <= 0) {
              continue;
            }
            final int qS = b - a;
            final TreeSet<Point> trapezoids = new TreeSet<>();
            trapezoids.add(new Point(trapezoidPQ(a, 2 * (n - a) + 1), a));
            trapezoids.add(new Point(trapezoidPQ(qV, 2 * h + 1), qV));
            trapezoids.add(new Point(trapezoidPQ(h, 2 * (k - a) + 1), h));
            trapezoids.add(new Point(trapezoidPQ(qT, 2 * (n - h - k) + 1), qT));
            trapezoids.add(new Point(trapezoidPQ(qS, 2 * (n - h - b) + 1), qS));
            if (trapezoids.size() == 5) {
              res.add(trapezoids.toString());
            }
          }
        }
      }
    }
    return res;
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(aa1(mN).size() + aa2(mN).size());
  }
}
