package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A046650 Number of rooted planar maps.
 * @author Sean A. Irvine
 */
public class A046650 extends Sequence2 {

  // After R. J. Mathar

  private int mN = 1;

  // Eq. 4.14
  private Z b1nm(final int n, final int m) {
    Z sum = Z.ZERO;
    if (m >= 2 && n >= m) {
      for (int j = m; j <= Math.min(n, 2 * m); ++j) {
        final Z t = Functions.FACTORIAL.z(j - 2)
          .multiply(Functions.FACTORIAL.z(3 * n - j - m - 1))
          .multiply(2L * j - m)
          .multiply(3L * m - 2L * j - 1)
          .divide(Functions.FACTORIAL.z(n - j))
          .divide(Functions.FACTORIAL.z(j - m))
          .divide(Functions.FACTORIAL.z(j - m + 1))
          .divide(Functions.FACTORIAL.z(2 * m - j));
        sum = sum.add(t);
      }
      sum = sum.multiply(m).divide(Functions.FACTORIAL.z(2 * n - m));
    }
    return sum;
  }

  // Eq. 8.21
  private Z b2wj(final int w, final int j) {
    Z sum = Z.ZERO;
    if (w >= j && j >= 1 /* && w >= 1*/) {
      for (int k = j; k <= Math.min(w, 2 * j - 1); ++k) {
        final Z t = Functions.FACTORIAL.z(k - 1)
          .multiply(Functions.FACTORIAL.z(3 * w - k - j))
          .multiply(2L * k - j + 1)
          .divide(Functions.FACTORIAL.z(k - j + 1))
          .divide(Functions.FACTORIAL.z(k - j))
          .divide(Functions.FACTORIAL.z(2 * j - k - 1))
          .divide(Functions.FACTORIAL.z(w - k));
        sum = sum.add(t);
      }
      sum = sum.multiply(j).divide(Functions.FACTORIAL.z(2 * w - j + 1));
    }
    return sum;
  }

  // Eq. 8.21
  private Z brwj(final int r, final int w, final int j) {
    Z sum = Z.ZERO;
    if (w >= j && j >= 1 /*&& w >= 1*/ && r > 1) {
      for (int k = j; k <= Math.min(w, 2 * j); ++k) {
        final Z t = Functions.FACTORIAL.z(k - 1)
          .multiply(Functions.FACTORIAL.z(3 * w - k - j - 1))
          .multiply(2L * k - j)
          .divide(Functions.FACTORIAL.z(k - j).square())
          .divide(Functions.FACTORIAL.z(2 * j - k))
          .divide(Functions.FACTORIAL.z(w - k));
        sum = sum.add(t);
      }
      sum = sum.multiply(j).divide(Functions.FACTORIAL.z(2 * w - j));
    }
    return sum;
  }

  private Z brnm(final int r, final int n, final int m) {
    if (r == 1) {
      return b1nm(n, m);
    } else if (r == 2 && (n & 1) == 1 && (m & 1) == 0) {
      return b2wj((n - 1) / 2, m / 2);
    } else if (n % r != 0 || m % r != 0) {
      return Z.ZERO;
    } else {
      return brwj(n, n / r, m / r);
    }
  }

  // Eq 6.7
  protected Z l(final int n, final int m) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(m).divisors()) {
      sum = sum.add(Functions.PHI.z(d).multiply(brnm(d.intValue(), n, m)));
    }
    return sum.divide(m);
  }

  @Override
  public Z next() {
    return l(++mN, 2);
  }
}
