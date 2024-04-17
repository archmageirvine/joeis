package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067650 The start of a record-breaking run of consecutive integers with a number of prime factors not equal to 2.
 * @author Sean A. Irvine
 */
public class A067650 extends Sequence1 {

  private long mBest = -1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      while (Functions.BIG_OMEGA.l(++mN) != 2) {
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
