package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024159 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, a+b+c=n such that n divides a^3 + b^3 + c^3.
 * @author Sean A. Irvine
 */
public class A024159 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b && a + b > c && Z.valueOf(a).pow(3).add(Z.valueOf(b).pow(3)).add(Z.valueOf(c).pow(3)).mod(mN) == 0) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
