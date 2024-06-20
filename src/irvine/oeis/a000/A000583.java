package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000583 Fourth powers: a(n) = n^4.
 * @author Sean A. Irvine
 */
public class A000583 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000583(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000583() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(4);
  }

  @Override
  public Z a(final Z n) {
    return n.pow(4);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).pow(4);
  }

}

