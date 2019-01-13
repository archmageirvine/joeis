package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001614.
 * @author Sean A. Irvine
 */
public class A001614 implements Sequence {

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
