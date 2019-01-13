package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005193.
 * @author Sean A. Irvine
 */
public class A005193 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(mF.factorial(k).square().multiply(Z.valueOf(k).pow(mN - 2 * k)));
    }
    sum = sum.multiply2();
    if ((mN & 1) == 1) {
      sum = sum.add(mF.factorial((mN + 1) / 2).multiply(mF.factorial((mN - 1) / 2)));
    }
    return sum;
  }
}
