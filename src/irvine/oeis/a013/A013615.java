package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013615 Triangle of coefficients in expansion of (1+8x)^n.
 * @author Sean A. Irvine
 */
public class A013615 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).shiftLeft(3L * mM);
  }
}
