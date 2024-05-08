package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000120 1&apos;s-counting sequence: number of 1&apos;s in binary expansion of n (or the binary weight of n).
 * @author Sean A. Irvine
 */
public class A000120 extends AbstractSequence implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000120(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000120() {
    super(0);
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(n.bitCount());
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(Integer.bitCount(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }
}

