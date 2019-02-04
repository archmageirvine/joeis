package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018193.
 * @author Sean A. Irvine
 */
public class A018193 extends A018192 {

  // After Alexander Stoimenow

  private Z psiTildeBar(final int d) {
    if (d == 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= d; ++k) {
      sum = sum.signedAdd((k & 1) == 0, lambda(d - k, k + 1).add(lambda(d - k, k)));
    }
    return sum;
  }

  @Override
  protected Z xi(final int c, final int d, final int k) {
    if (2 * k > d || k < 0) {
      return Z.ZERO;
    }
    return lambda(d - 2 * k, k + 1, c);
  }

  @Override
  protected Z xiBar(final int c, final int d, final int k) {
    return xi(c, d - 2, k - 1);
  }

  private Z psiTilde(final int d) {
    return lambda(d).subtract(psiTildeBar(d));
  }

  @Override
  protected Z gammaTilde(final int d, final int c) {
    if (c == 1) {
      return (d & 1) == 0 ? psiTilde(d / 2) : Z.ZERO;
    }
    if (c == 2) {
      return eta(2, d).add(d == 1 ? 1 : 0);
    } else {
      return eta(c, d);
    }
  }

}

