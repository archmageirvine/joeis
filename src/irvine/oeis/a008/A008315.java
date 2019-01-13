package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008315.
 * @author Sean A. Irvine
 */
public class A008315 implements Sequence {

  private int mN = -1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).subtract(Binomial.binomial(mN, mM - 1));
  }
}
