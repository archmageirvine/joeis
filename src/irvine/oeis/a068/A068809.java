package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A068809.
 * @author Sean A. Irvine
 */
public class A068809 implements Sequence {

  private long mSum = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sq = Z.valueOf(++mN).square();
      final long d = ZUtils.digitSum(sq);
      if (d > mSum) {
        mSum = d;
        return sq;
      }
    }
  }
}

