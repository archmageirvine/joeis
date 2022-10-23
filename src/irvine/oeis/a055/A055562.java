package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055562 a(n) = least number greater than a(n-1) not the sum of an earlier pair of consecutive terms, a(0) = 2.
 * @author Sean A. Irvine
 */
public class A055562 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final long m = mN / 2;
    return Z.valueOf((mN & 1) == 0 ? 3 * m + 1 + (LongUtils.lg(m) & 1) : 3 * m + 3);
  }
}
