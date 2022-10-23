package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A056529 Number of iterations of sum of digits of square to reach 1, 9, 13 or 16.
 * @author Sean A. Irvine
 */
public class A056529 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long cnt = 0;
    while (n != 1 && n != 9 && n != 13 && n != 16) {
      ++cnt;
      n = ZUtils.digitSum(n * n);
    }
    return Z.valueOf(cnt);
  }
}
