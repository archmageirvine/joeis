package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004127 Number of planar hexagon trees with n hexagons.
 * @author Sean A. Irvine
 */
public class A004127 implements Sequence {

  private static final Z TWELVE = Z.valueOf(12);
  private int mN = 0;

  private Z t(final int a, final int b) {
    if (a % b == 0) {
      final int n = a / b;
      final long k = 5L * n + 1;
      return Binomial.binomial(k, n).divide(k);
    } else {
      return Z.ZERO;
    }
  }

  private Z u(final int n) {
    if ((n & 1) == 0) {
      final long k = 5L * n / 2 + 1;
      return Binomial.binomial(k, n / 2).divide(k);
    } else {
      final int k = 5 * n + 1;
      return Binomial.binomial(k / 2, (n - 1) / 2).multiply(6).divide(k);
    }
  }

  @Override
  public Z next() {
    ++mN;
    return new Q(t(mN, 1), Z.FOUR.multiply(2L * mN + 1))
      .add(new Q(t(mN, 2), Z.SIX))
      .add(new Q(t(mN - 1, 3).multiply(5L * mN - 2), Z.SIX.multiply(2L * mN + 1)))
      .add(new Q(t(mN - 1, 6), Z.SIX))
      .add(new Q(u(mN).multiply(7), TWELVE)).toZ();
  }
}
