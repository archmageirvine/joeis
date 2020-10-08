package irvine.oeis.a035;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035342 The convolution matrix of the double factorial of odd numbers (A001147).
 * @author Sean A. Irvine
 */
public class A035342 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= n - k; ++j) {
      sum = sum.add(Binomial.binomial(j + k - 1, k - 1).multiply(Binomial.binomial(2L * n - j - k - 1, n - 1)).multiply(j + k).shiftLeft(j));
    }
    return sum.multiply(mF.factorial(n - 1)).divide(mF.factorial(k)).shiftRight(n - k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

