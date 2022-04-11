package irvine.oeis.a055;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055968 Product_{i=1..n} (i-1)!*(i+2*n-1)!/(i+n-1)!.
 * @author Sean A. Irvine
 */
public class A055968 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(MemoryFactorial.SINGLETON.factorial(k - 1))
        .multiply(MemoryFactorial.SINGLETON.factorial(k + 2 * mN - 1))
        .divide(MemoryFactorial.SINGLETON.factorial(k + mN - 1));
    }
    return prod;
  }
}
