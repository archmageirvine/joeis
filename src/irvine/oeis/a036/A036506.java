package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036506 Number of labeled 4-trees with n nodes.
 * @author Sean A. Irvine
 */
public class A036506 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 6) {
      return mN < 4 ? Z.ZERO : Z.ONE;
    }
    return Binomial.binomial(mN, 4).multiply(Z.valueOf(4L * mN - 15).pow(mN - 6));
  }
}
