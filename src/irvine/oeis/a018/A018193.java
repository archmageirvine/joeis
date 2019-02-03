package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018193.
 * @author Sean A. Irvine
 */
public class A018193 extends A018192 {

  // todo does not currently work

  @Override
  protected Z zeta(final int c, final int d, final int k) {
    final int n = d - 2 * k;
    return lambda(n, k + 1, c);
  }

  @Override
  protected Z gammaTilde(final int d, final int c) {
    if (c == 1) {
      return (d & 1) == 0 ? psiBar1(d / 2) : Z.ZERO;
    }
    if (c == 2) {
      return eta(2, d).add(d == 1 ? 1 : 0);
    } else {
      return eta(c, d);
    }
  }

  private Z psiBar1(final int d) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= d; ++k) {
      sum = sum.signedAdd((k & 1) == 0, lambda(d - k, k +1).add(lambda(d - k, k)));
    }
    return sum;
  }
}

