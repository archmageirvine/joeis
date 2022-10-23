package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055982 a(n+1) = a(n) converted to base 10 from base 11.
 * @author Georg Fischer
 */
public class A055982 extends Sequence0 {

  protected Z mAn;
  protected int mSrcBase;

  /** Construct the sequence. */
  public A055982() {
    this(11);
  }

  /**
   * Generic constructor with parameters
   * @param srcBase
   */
  public A055982(final int srcBase) {
    mSrcBase = srcBase;
    mAn = Z.TEN;
  }

  @Override
  public Z next() {
    final Z result = mAn;
    mAn = new Z(mAn.toString(10), mSrcBase);
    return result;
  }
}
