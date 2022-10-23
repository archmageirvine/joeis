package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024154 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, a+b+c=n that are acute.
 * @author Sean A. Irvine
 */
public class A024154 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b) {
          final long a2 = a * a;
          final long b2 = b * b;
          final long c2 = c * c;
          if (a2 + b2 > c2 && b2 + c2 > a2 && c2 + a2 > b2) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
