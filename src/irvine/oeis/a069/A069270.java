package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009769.
 * @author Sean A. Irvine
 */
public class A069270 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 3 * mM, mM).multiply(mN - mM + 1).divide(mN + 2 * mM + 1);
  }
}
