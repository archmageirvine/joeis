package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020891 Ordered set of c + a - b as (a,b,c) runs through all primitive Pythagorean triples with a&lt;b&lt;c.
 * @author Sean A. Irvine
 */
public class A020891 extends Sequence1 {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      mN += 2;
      for (long b = 2; b < mN * mN; ++b) {
        final long ac = mN + b;
        for (long a = 1; a < b; ++a) {
          if (LongUtils.gcd(a, b) == 1) {
            final long c = ac - a;
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
