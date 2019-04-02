package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004140 Number of nonempty labeled simple graphs on nodes chosen from an n-set.
 * @author Sean A. Irvine
 */
public class A004140 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).shiftLeft(k * (k - 1) / 2));
    }
    return sum;
  }
}
