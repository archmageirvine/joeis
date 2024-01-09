package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067802 Triangle with T(n,k)=C(2n+1,n-k)^2*(2k+1)/(2n+1).
 * @author Sean A. Irvine
 */
public class A067802 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Binomial.binomial(2 * n + 1, n - m).square().multiply(2 * m + 1).divide(2 * n + 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
