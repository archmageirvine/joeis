package irvine.oeis.a048;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048601 Robbins triangle read by rows: T(n,k) = number of alternating sign n X n matrices with a 1 at top of column k (n &gt;= 1, 1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A048601 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A048601(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A048601() {
    super(1);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int k) {
    Z prod = Binomial.binomial(n + k - 2, k - 1).multiply(mF.factorial(2 * n - k - 1).divide(mF.factorial(n - k)));
    for (int j = 0; j <= n - 2; ++j) {
      prod = prod.multiply(mF.factorial(3 * j + 1));
    }
    for (int j = 0; j <= n - 2; ++j) {
      prod = prod.divide(mF.factorial(n + j));
    }
    return prod;
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

