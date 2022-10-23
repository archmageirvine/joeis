package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055473 Powers of ten written in base 2.
 * @author Sean A. Irvine
 */
public class A055473 extends Sequence0 {

  private int mBase;
  private Z mN = null;

  /** Construct the sequence. */
  public A055473() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param base write the number in this base
   */
  public A055473(final int base) {
    mBase = base;
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
    } else {
      mN = mN.multiply(10);
    }
    return new Z(mN.toString(mBase));
  }
}
