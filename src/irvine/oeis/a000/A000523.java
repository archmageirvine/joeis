package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000523 <code>a(n) = floor(log_2(n))</code>.
 * @author Sean A. Irvine
 */
public class A000523 implements Sequence {

  private Z mR = Z.ZERO;
  private long mLim = 2;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN >= mLim) {
      mR = mR.add(1);
      mLim <<= 1;
    }
    return mR;
  }
}
