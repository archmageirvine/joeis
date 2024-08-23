package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001203;

/**
 * A071940 Number of 1's among the first n terms of the simple continued fraction for Pi.
 * @author Sean A. Irvine
 */
public class A071940 extends Sequence1 {

  private final Sequence mPiContFrac = new A001203();
  private Z mCnt = Z.ZERO;

  @Override
  public Z next() {
    if (Z.ONE.equals(mPiContFrac.next())) {
      mCnt = mCnt.add(1);
    }
    return mCnt;
  }
}
