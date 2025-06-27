package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385202 allocated for Miles Englezou.
 * @author Sean A. Irvine
 */
public class A385202 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private boolean mForcedZero = false;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
        if (mForcedZero) {
          return Z.ZERO;
        }
        mForcedZero = true;
      }
      if (mN % mM != 0) {
        final long r = mN - mM % mN;
        if (mN % r != 0) {
          mForcedZero = false;
          return Z.valueOf(mM);
        }
      }
    }
  }
}

