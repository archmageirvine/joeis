package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072931 Number of ways to write n as a sum of 2 semiprimes.
 * @author Sean A. Irvine
 */
public class A072931 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 4; k <= mN / 2; ++k) {
      if (Functions.BIG_OMEGA.l(k) == 2 && Functions.BIG_OMEGA.l(mN - k) == 2) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

