package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020889 Ordered set of b + c - a as (a,b,c) runs through all primitive Pythagorean triples with a&lt;b&lt;c.
 * @author Sean A. Irvine
 */
public class A020889 extends Sequence1 {

  private long mN = 4;
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      mN += 2;
      for (long a = 1; a < mN; ++a) {
        final long bc = mN + a;
        for (long b = a + 1; b <= bc / 2; ++b) {
          if (LongUtils.gcd(a, b) == 1) {
            final long c = bc - b;
            if (c > b && a * a + b * b == c * c && LongUtils.gcd(a, c) == 1 && LongUtils.gcd(b, c) == 1) {
              ++mM;
            }
          }
        }
      }
    }
    --mM;
    return Z.valueOf(mN);
  }
}
