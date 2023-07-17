package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000225 a(n) = 2^n - 1. (Sometimes called Mersenne numbers, although that name is usually reserved for A001348.).
 * @author Sean A. Irvine
 */
public class A000225 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000225(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000225() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(Z.ONE);
  }
}

