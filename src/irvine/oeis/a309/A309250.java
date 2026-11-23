package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A309250 Index of the binary string underlying the n-th Post correspondence problem encoding.
 * @author Gregory Morse
 */
public class A309250 extends Sequence1 {
  private Z mIndex = Z.ZERO;
  private Z mRemaining = Z.ZERO;
  private Z mBlock = Z.valueOf(4);
  private Z mMultiplicity = Z.ONE;

  @Override
  public Z next() {
    if (mRemaining.isZero()) {
      if (mBlock.isZero()) {
        mBlock = mMultiplicity.shiftLeft(3);
        mMultiplicity = mMultiplicity.multiply2();
      }
      // Half of the subsets of the L-1 cut positions have odd size,
      // giving the requisite even number of pieces.
      mRemaining = mMultiplicity;
      mIndex = mIndex.add(1);
      mBlock = mBlock.subtract(1);
    }
    mRemaining = mRemaining.subtract(1);
    return mIndex;
  }
}
