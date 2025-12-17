package irvine.oeis.a391;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A391452 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A391452 extends Sequence1 {

  // After Janaka Rodrigo

  private static int pFromSeries(final int q, final int s) {
    return q * (2 * s + q);
  }

  private static Set<String> bb1(final int n) {
    if (n <= 4) {
      return Collections.emptySet();
    }
    final HashSet<String> res = new HashSet<>();
    final int qMax = n - 4;
    for (int h = 1; h <= qMax; ++h) {
      for (int k = 1; k <= qMax; ++k) {
        final int maxM = n - (2 * h + k) - 1;
        if (maxM < 1) {
          continue;
        }
        for (int m = 1; m <= maxM; ++m) {
          final int qN = h + m;
          if (qN > qMax) {
            continue;
          }
          final int qM = n - (h + m + k);
          if (qM < 1 || qM > qMax) {
            continue;
          }
          final int r = n - (2 * h + k + m);
          if (r <= 0) {
            continue;
          }
          final int pV = pFromSeries(h, m);
          if (pV < 3) {
            continue;
          }
          final int pW = pFromSeries(k, m);
          if (pW < 3) {
            continue;
          }
          final int pL = pFromSeries(h, k);
          if (pL < 3) {
            continue;
          }
          final int pM = pFromSeries(qM, k);
          if (pM < 3) {
            continue;
          }
          final int pN = pFromSeries(qN, r);
          if (pN < 3) {
            continue;
          }
          final TreeSet<Point> pairs = new TreeSet<>();
          pairs.add(new Point(pV, h));
          pairs.add(new Point(pW, k));
          pairs.add(new Point(pL, h));
          pairs.add(new Point(pM, qM));
          pairs.add(new Point(pN, qN));
          if (pairs.size() == 5) {
            res.add(pairs.toString());
          }
        }
      }
    }
    return res;
  }

  private static int sumArithQ(final int first, final int q) {
    return q * (first + q - 1);
  }

  private static Set<String> bb2(final int n) {
    final HashSet<String> res = new HashSet<>(); // Using String is way faster than checking TreeSet's
    for (int h = 1; h < n - 1; ++h) {
      for (int k = 1; k < n - h; ++k) {
        final int qW = n - h - k;
        if (qW >= 0) {
          for (int qS = 1; qS < h; ++qS) {
            for (int qV = 1; qV < k; ++qV) {
              final int qU = k - qV;
              final int qT = h - qS;
              final TreeSet<Point> pairs = new TreeSet<>();
              pairs.add(new Point(sumArithQ(2 * (h - qS) + 1, qU), qU));
              pairs.add(new Point(sumArithQ(2 * (h + k - qV) + 1, qV), qV));
              pairs.add(new Point(sumArithQ(2 * k + 1, qW), qW));
              pairs.add(new Point(sumArithQ(2 * (n - h - k) + 1, qT), qT));
              pairs.add(new Point(sumArithQ(2 * (n - qS - qV) + 1, qS), qS));
              if (pairs.size() == 5) {
                res.add(pairs.toString());
              }
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
    final Set<String> sets = bb1(mN);
    sets.addAll(bb2(mN));
    return Z.valueOf(sets.size());
  }
}
