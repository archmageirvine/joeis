package irvine.oeis.a039;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039622 Number of n X n Young tableaux.
 * @author Sean A. Irvine
 */
public class A039622 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  private int mN = -1;

  @Override
  public Z next() {
    Z prod = mF.factorial(++mN * mN);
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(mF.factorial(k)).divide(mF.factorial(mN + k));
    }
    return prod;
  }
}
