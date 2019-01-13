package irvine.oeis.a009;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009963.
 * @author Sean A. Irvine
 */
public class A009963 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z prod = Z.ONE;
    for (int k = 1; k <= mM; ++k) {
      prod = prod.multiply(mF.factorial(mN + 1 - k)).divide(mF.factorial(k));
    }
    return prod;
  }
}
