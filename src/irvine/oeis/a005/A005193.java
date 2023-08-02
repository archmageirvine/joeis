package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005193 Balanced labeled graphs.
 * @author Sean A. Irvine
 */
public class A005193 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(mF.factorial(k).square().multiply(Z.valueOf(k).pow(mN - 2L * k)));
    }
    sum = sum.multiply2();
    if ((mN & 1) == 1) {
      sum = sum.add(mF.factorial((mN + 1) / 2).multiply(mF.factorial((mN - 1) / 2)));
    }
    return sum;
  }
}
