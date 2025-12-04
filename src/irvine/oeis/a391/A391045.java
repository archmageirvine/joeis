package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391045 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A391045 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 1, mM + 1).multiply(Binomial.binomial(2L * mN - mM + 1, mM)).divide(mN + 1);
  }
}
