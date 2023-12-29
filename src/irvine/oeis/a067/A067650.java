package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067633.
 * @author Sean A. Irvine
 */
public class A067650 extends Sequence1 {

  private long mBest = -1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      while (Jaguar.factor(++mN).bigOmega() != 2) {
        ++cnt;
      }
      if (cnt > mBest) {
        final Z res = Z.valueOf(mN - cnt);
        mBest = cnt;
        return res;
      }
    }
  }
}
