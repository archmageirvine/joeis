package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001614 Connell sequence: 1 odd, 2 even, 3 odd, ...
 * @author Sean A. Irvine
 */
public class A001614 extends AbstractSequence {

  /* Construct the sequence. */
  public A001614() {
    super(1);
  }

  private long mBlockLength = 0;
  private long mBlockRemaining = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (mBlockRemaining == 0) {
      mBlockRemaining = ++mBlockLength;
      if ((mBlockLength & 1) == 1) {
        mN -= 2;
      }
    }
    --mBlockRemaining;
    mN += 2;
    return Z.valueOf(mN + (mBlockLength & 1));
  }
}
