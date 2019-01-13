package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008313.
 * @author Sean A. Irvine
 */
public class A008313 implements Sequence {

  private int mN = -1;
  private int mM = 1;

  @Override
  public Z next() {
    if (mN < 1) {
      ++mN;
      return Z.ONE;
    }
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN - 1, mN / 2 - mM).subtract(Binomial.binomial(mN - 1, mN / 2 - mM - 2));
  }
}
