package irvine.oeis.a048;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048786 Triangle of coefficients of certain exponential convolution polynomials.
 * @author Sean A. Irvine
 */
public class A048786 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN - 1, mM - 1).multiply(mF.factorial(mN)).divide(mF.factorial(mM)).shiftLeft(2 * (mN - mM));
  }
}
