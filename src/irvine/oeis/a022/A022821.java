package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022821 [ (n+1)/(n-1) ] + [ (n+2)/(n-2) ] + ... + [ (2n-1)/1 ].
 * @author Sean A. Irvine
 */
public class A022821 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A022821(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A022821() {
    super(2);
  }

  protected long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add((2 * mN - k) / k);
    }
    return sum;
  }
}
