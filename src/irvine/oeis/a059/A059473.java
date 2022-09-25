package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059473 Triangle T(n, k) is coefficient of z^n*w^k in 1/(1 - 2*z - 2*w - 2*z*w) read by rows in order 00, 10, 01, 20, 11, 02, ...
 * @author Sean A. Irvine
 */
public class A059473 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(n + m - k, n)).shiftLeft(n + m - k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
