package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011973.
 * @author Sean A. Irvine
 */
public class A068763 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > (mN + 1) / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 1 - mM, mM).multiply(Binomial.catalan(mN - mM));
  }
}
