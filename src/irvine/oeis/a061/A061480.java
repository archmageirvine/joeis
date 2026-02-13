package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A061480 n-th digit in decimal expansion of 1/n.
 * @author Sean A. Irvine
 */
public class A061480 extends AbstractSequence {

  private int mN;
  private Z mT = Z.ONE;
  private final Z mBase;

  /** Construct the sequence. */
  public A061480() {
    this(1, 10);
  }

  /**
   * Generic constructor with parameter.
   * @param offset first index
   * @param base number base
   */
  public A061480(final int offset, final int base) {
    super(1);
    mN = 0;
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    mT = mT.multiply(mBase);
    return mT.divide(++mN).mod(mBase);
  }
}

