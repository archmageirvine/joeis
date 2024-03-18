package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068834 Square such that the next three squares also having a square digit sum.
 * @author Sean A. Irvine
 */
public class A068834 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final Z p = Z.valueOf(++mN).square();
      if (LongUtils.isSquare(ZUtils.digitSum(p))) {
        final Z q = Z.valueOf(mN + 1).square();
        if (LongUtils.isSquare(ZUtils.digitSum(q))) {
          final Z r = Z.valueOf(mN + 2).square();
          if (LongUtils.isSquare(ZUtils.digitSum(r))) {
            final Z s = Z.valueOf(mN + 3).square();
            if (LongUtils.isSquare(ZUtils.digitSum(s))) {
              return p;
            }
          }
        }
      }
    }
  }
}
