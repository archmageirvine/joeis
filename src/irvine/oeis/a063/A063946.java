package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063946 Write n in binary and complement second bit (from the left), with a(0)=0 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A063946 extends Sequence0 {

  private long mN = -1;
  private long mBit = 1;
  private long mLim = 4;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(mN);
    }
    if (mN == mLim) {
      mBit <<= 1;
      mLim <<= 1;
    }
    return Z.valueOf(mN ^ mBit);
  }
}
