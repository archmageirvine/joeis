package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000584 Fifth powers: a(n) = n^5.
 * @author Sean A. Irvine
 */
public class A000584 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000584(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000584() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(5);
  }

  @Override
  public Z a(final Z n) {
    return n.pow(5);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).pow(5);
  }

}

