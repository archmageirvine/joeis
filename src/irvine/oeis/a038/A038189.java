package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038189 Bit to left of least significant 1-bit in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A038189 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A038189(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A038189() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long m = mN;
    while ((m & 1) != 1) {
      m >>>= 1;
    }
    return Z.valueOf((m >>> 1) & 1);
  }
}
