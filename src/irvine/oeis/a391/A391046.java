package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391046 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A391046 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 1, mM + 1).multiply(Binomial.binomial(3 * mN - 2 * mM + 1, mM)).divide(mN + 1);
  }
}
