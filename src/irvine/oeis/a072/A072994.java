package irvine.oeis.a072;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072994 Number of solutions to x^n==1 (mod n), 1&lt;=x&lt;=n.
 * @author Sean A. Irvine
 */
public class A072994 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (LongUtils.modPow(k, mN, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

