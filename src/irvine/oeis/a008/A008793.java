package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008793.
 * @author Sean A. Irvine
 */
public class A008793 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(mF.factorial(2 * mN + k - 1).multiply(mF.factorial(k - 1))).divide(mF.factorial(mN + k - 1).square());
    }
    return prod;
  }
}


