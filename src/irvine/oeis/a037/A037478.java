package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037478.
 * @author Sean A. Irvine
 */
public class A037478 implements Sequence {

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
