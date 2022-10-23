package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024164 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, a+b+c=n such that c - b = b - a.
 * @author Sean A. Irvine
 */
public class A024164 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b && a + b > c && c - b == b - a) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
