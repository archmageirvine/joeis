package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000165 Double factorial of even numbers: (2n)!! = 2^n*n!.
 * @author Sean A. Irvine
 */
public class A000165 extends AbstractSequence {

  /** Construct the sequence. */
  public A000165() {
    super(0);
  }

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
    }
    return mF.shiftLeft(mN);
  }
}

