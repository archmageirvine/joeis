package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391403 allocated for Richard Ehrenborg.
 * @author Sean A. Irvine
 */
public class A391403 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, 2 * mM).multiply(Binomial.binomial(2 * mM, mM));
  }
}
