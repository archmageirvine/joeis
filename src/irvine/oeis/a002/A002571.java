package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;


/**
 * A002571 From a definite integral.
 * @author Sean A. Irvine
 */
public class A002571 extends Sequence1 {

  private final Z[] mSeq = {Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, null, null};
  private final int mLast = mSeq.length - 1;
  private Z mTwo = Z.TWO;

  @Override
  public Z next() {
    if (mSeq[mLast - 1] == null) {
      mSeq[mLast - 1] = Z.ONE;
      return Z.ONE;
    }
    mTwo = mTwo.negate();
    if (mSeq[mLast] == null) {
      mSeq[mLast] = Z.FIVE;
      return Z.FIVE;
    }
    final Z t = mSeq[4].subtract(mSeq[2]).multiply(8).add(mSeq[0]).add(mTwo);
    System.arraycopy(mSeq, 1, mSeq, 0, mLast);
    mSeq[mLast] = t;
    return mSeq[mLast];
  }

}
