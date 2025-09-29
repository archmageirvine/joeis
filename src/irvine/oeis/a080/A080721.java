package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080721 Triangle of binomial(n,k)*(binomial(n+k,k)-binomial(n+k-2,k-1)).
 * @author Sean A. Irvine
 */
public class A080721 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mM == 0 ? Z.ONE : Binomial.binomial(mN, mM).multiply(Binomial.binomial(mN + mM, mM).subtract(Binomial.binomial(mN + mM - 2, mM - 1)));
  }
}
