package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000422 Concatenation of numbers from n down to 1.
 * @author Sean A. Irvine
 */
public class A000422 extends AbstractSequence {

  /* Construct the sequence. */
  public A000422() {
    super(1);
  }

  protected long mN = 0;
  private long mMult = 10;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= mMult) {
      mMult *= 10;
    }
    mA = mB.multiply(mN).add(mA);
    mB = mB.multiply(mMult);
    return mA;
  }
}

