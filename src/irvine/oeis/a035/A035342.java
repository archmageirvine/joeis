package irvine.oeis.a035;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A035342 The convolution matrix of the double factorial of odd numbers (A001147).
 * @author Sean A. Irvine
 */
public class A035342 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A035342(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A035342() {
    super(1);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= n - k; ++j) {
      sum = sum.add(Binomial.binomial(j + k - 1, k - 1).multiply(Binomial.binomial(2L * n - j - k - 1, n - 1)).multiply(j + k).shiftLeft(j));
    }
    return sum.multiply(Functions.FACTORIAL.z(n - 1)).divide(Functions.FACTORIAL.z(k)).shiftRight(n - k);
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

