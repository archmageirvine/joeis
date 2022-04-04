package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049505 a(n) = Product_{1&lt;=i&lt;=j&lt;=n} (i+j+n-1)/(i+j-1), number of symmetric plane partitions in n-cube.
 * @author Sean A. Irvine
 */
public class A049505 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(mF.factorial(2 * k - 2))
        .multiply(mF.factorial(k + 2 * mN - 1));
    }
    for (int k = 1; k <= mN; ++k) {
      prod = prod.divide(mF.factorial(k + mN - 1))
        .divide(mF.factorial(2 * k + mN - 2));
    }
    return prod;
  }
}

