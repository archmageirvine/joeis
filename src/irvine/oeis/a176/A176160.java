package irvine.oeis.a176;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A176160 A polynomial coefficient sequence:p(x,n,m)=(1 + 4*Binomial[n, m]*x)^n.
 * @author Sean A. Irvine
 */
public class A176160 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).multiply(4).add(1).pow(mN);
  }
}
