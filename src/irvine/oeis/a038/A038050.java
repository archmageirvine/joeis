package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038050 Number of labeled rooted trees with 3-colored leaves.
 * @author Sean A. Irvine
 */
public class A038050 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Z.valueOf(mN - k).pow(mN - 1)).shiftLeft(k));
    }
    return sum;
  }
}
