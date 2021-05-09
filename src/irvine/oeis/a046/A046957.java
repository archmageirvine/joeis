package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046957 Numbers k where cos(k) decreases monotonically to 0.
 * @author Sean A. Irvine
 */
public class A046957 implements Sequence {

  private CR mBest = CR.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final CR cos = CR.valueOf(++mN).cos();
      if (cos.signum() > 0 && cos.compareTo(mBest) < 0) {
        mBest = cos;
        return Z.valueOf(mN);
      }
    }
  }
}
