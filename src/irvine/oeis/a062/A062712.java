package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062712 Numbers that are n-gons for three or more n's, where n=3,4,5,...,16.
 * @author Sean A. Irvine
 */
public class A062712 extends Sequence1 {

  private long mN = 0;

  private boolean isGonal(final long n, final long k) {
    final Z t = Z.valueOf(n).multiply(8 * (k - 2)).add((k - 4) * (k - 4));
    final Z[] s = t.sqrtAndRemainder();
    if (!s[1].isZero()) {
      return false;
    }
    return s[0].add(k - 4).mod(2 * (k - 2)) == 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int cnt = 0;
      for (int k = 3; k <= 16; ++k) {
        if (isGonal(mN, k) && ++cnt >= 3) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
