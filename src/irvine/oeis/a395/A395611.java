package irvine.oeis.a395;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395611 Triangle read by rows: coefficients of (1+x)*(1+(n+1)*x)^(n-1).
 * @author Sean A. Irvine
 */
public class A395611 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mM == 0 ? Z.ONE : Binomial.binomial(mN, mM).multiply(mN + 1 - mM).multiply(Z.valueOf(mN + 1).pow(mM - 1));
  }
}
