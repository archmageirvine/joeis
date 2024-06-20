package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000578 The cubes: a(n) = n^3.
 * @author Sean A. Irvine
 */
public class A000578 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000578(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000578() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3);
  }

  @Override
  public Z a(final Z n) {
    return n.pow(3);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).pow(3);
  }

}
