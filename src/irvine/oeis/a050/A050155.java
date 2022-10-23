package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050155 Triangle T(n,k), k&gt;=0 and n&gt;=1, read by rows defined by: T(n,k) = (2k+3)*binomial(2n,n-k-1)/(n+k+2).
 * @author Sean A. Irvine
 */
public class A050155 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * mN, mN - mM - 1).multiply(2 * mM + 3).divide(mN + mM + 2);
  }
}
