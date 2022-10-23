package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A037478 Number of positive solutions to "numbers that are n times sum of their digits".
 * @author Sean A. Irvine
 */
public class A037478 extends Sequence1 {

  // After R. J. Mathar

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long k = 0;
    while (true) {
      final long x = mN * ++k;
      final long d = ZUtils.digitSum(x);
      if (d * mN == x) {
        ++cnt;
      }
      if (x / String.valueOf(x).length() > 9 * mN) {
        break;
      }
    }
    return Z.valueOf(cnt);
  }
}
