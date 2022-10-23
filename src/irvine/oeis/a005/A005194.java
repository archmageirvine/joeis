package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005194 Balanced symmetric graphs.
 * @author Sean A. Irvine
 */
public class A005194 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      if ((mN & 1) == 1 && (k & 1) == 0) {
        continue;
      }
      sum = sum.add(mF.factorial(k).multiply(Z.valueOf(k).pow((mN - 2 * k) / 2)));
    }
    sum = sum.multiply2();
    if ((mN & 1) == 1) {
      final int t = (mN - 1) / 2;
      if ((t & 1) == 0 && t > 0) {
        sum = sum.add(mF.factorial(t));
      }
      sum = sum.add(mF.factorial((mN + 1) / 2));
    }
    return sum;
  }
}
