package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014817 a(n) = Sum_{k=1..n} floor(k^2/n).
 * @author Sean A. Irvine
 */
public class A014817 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A014817(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A014817() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).square().divide(mN));
    }
    return sum;
  }
}
