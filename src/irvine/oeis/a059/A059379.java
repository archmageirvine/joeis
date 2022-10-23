package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059379 Array of values of Jordan function J_k(n) read by antidiagonals (version 1).
 * @author Sean A. Irvine
 */
public class A059379 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  static Z jordanTotient(final long n, final long m) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      final int mu = Mobius.mobius(n / d);
      if (mu != 0) {
        sum = sum.signedAdd(mu > 0, dd.pow(m));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return jordanTotient(mN + 1 - mM, mM);
  }
}
