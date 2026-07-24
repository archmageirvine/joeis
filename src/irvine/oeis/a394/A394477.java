package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394477 Number of integers k in 1..n such that the numerator of the reduced fraction (n*(n-1) + k)/n is prime.
 * @author Sean A. Irvine
 */
public class A394477 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long m = mN * (mN - 1);
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (new Q(m + k, mN).num().isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

