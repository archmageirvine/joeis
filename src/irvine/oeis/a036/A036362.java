package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036362 Number of labeled 3-trees with n nodes.
 * @author Sean A. Irvine
 */
public class A036362 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 5) {
      return mN <= 2 ? Z.ZERO : Z.ONE;
    }
    return Binomial.binomial(mN, 3).multiply(Z.valueOf(3L * mN - 8).pow(mN - 5));
  }
}
