package irvine.oeis.a075;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001597.
 * @author Sean A. Irvine
 */
public class A075117 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, (mN - mM) / 2, j -> Binomial.binomial(mN - mM, 2L * j).multiply(Z.valueOf(4L * mM + 1).pow(j))).shiftLeft(1 + mM - mN);
  }
}
