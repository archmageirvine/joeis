package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051295 a(0)=1; thereafter, a(m+1) = Sum_{k=0..m} k!*a(m-k).
 * @author Sean A. Irvine
 */
public class A051295 extends MemorySequence {

  private final int mMult;

  /** Construct the sequence. */
  public A051295() {
    this(0, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult order of the factorial: 2 = double, 3 = triple and so on
   */
  public A051295(final int offset, final int mult) {
    super(offset);
    mMult = mult;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k < n; ++k) {
      if (k > 1) {
        f = f.multiply(mMult * k - (mMult - 1));
      }
      // System.out.print(" f=" + f + ",sum=" + sum + ",a(n-1-k)=" + a(n - 1 - k));
      sum = sum.add(f.multiply(a(n - 1 - k)));
    }
    // System.out.println();
    return sum;
  }
}
