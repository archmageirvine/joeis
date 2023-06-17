package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002379 a(n) = floor(3^n / 2^n).
 * @author Sean A. Irvine
 */
public class A002379 extends AbstractSequence {

  /** Construct the sequence. */
  public A002379() {
    super(0);
  }

  private Z mT = Z.ONE;
  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(3);
    }
    return mT.shiftRight(mN);
  }
}
