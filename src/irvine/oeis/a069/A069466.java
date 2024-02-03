package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067845.
 * @author Sean A. Irvine
 */
public class A069466 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * mN, mN).multiply(Binomial.binomial(mN, mM).square());
  }
}
