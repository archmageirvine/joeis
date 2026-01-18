package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083230 Number of repunit divisors of n.
 * @author Sean A. Irvine
 */
public class A083230 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1; // 1 | mN
    long k = 11;
    while (k <= mN) {
      if (mN % k == 0) {
        ++cnt;
      }
      k = k * 10 + 1;
    }
    return Z.valueOf(cnt);
  }
}

