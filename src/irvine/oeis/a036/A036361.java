package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036361 Number of labeled 2-trees with n nodes.
 * @author Sean A. Irvine
 */
public class A036361 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 4) {
      return mN == 1 ? Z.ZERO : Z.ONE;
    }
    return Binomial.binomial(mN, 2).multiply(Z.valueOf(2L * mN - 3).pow(mN - 4));
  }
}
