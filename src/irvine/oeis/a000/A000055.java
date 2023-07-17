package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MemorySequence;

/**
 * A000055 Number of trees with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A000055 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000055(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000055() {
    super(0);
  }

  private final MemorySequence mB = new A000081(0);

  @Override
  public Z next() {
    final int n = mB.size();
    mB.next();
    if (n < 4) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(mB.a(k).multiply(mB.a(n - k)));
    }
    if ((n & 1) == 0) {
      sum = sum.subtract(mB.a(n / 2));
    }
    return mB.a(n).subtract(sum.divide2());
  }

}

