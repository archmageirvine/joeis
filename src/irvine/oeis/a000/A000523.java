package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A000523 a(n) = floor(log_2(n)).
 * @author Sean A. Irvine
 */
public class A000523 extends Sequence1 implements DirectSequence {

  private Z mR = Z.ZERO;
  private long mLim = 2;
  private long mN = 0;

  @Override
  public Z a(final Z n) {
    return Z.valueOf(n.bitLength() - 1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(IntegerUtils.floorLog2(n));
  }

  @Override
  public Z next() {
    if (++mN >= mLim) {
      mR = mR.add(1);
      mLim <<= 1;
    }
    return mR;
  }
}
