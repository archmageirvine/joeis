package irvine.oeis.a073;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073023 Number of solutions to the equation n^x==1 (mod x), 1&lt;=x&lt;=n.
 * @author Sean A. Irvine
 */
public class A073023 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1;
    for (long k = 2; k <= mN; ++k) {
      if (LongUtils.modPow(mN, k, k) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
