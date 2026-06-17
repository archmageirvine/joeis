package irvine.oeis.a085;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085391 Square array of centered numbers, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A085391 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    return Binomial.binomial(n + k, k).subtract(Binomial.binomial(n, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
