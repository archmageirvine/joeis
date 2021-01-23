package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024160 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, a+b+c=n such that (c-b)(c-a)(b-a) divides (c+b)(c+a)(b+a).
 * @author Sean A. Irvine
 */
public class A024160 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b && a + b > c && Z.valueOf(b + c).multiply(c + a).multiply(a + b).mod(Z.valueOf(c - b).multiply(c - a).multiply(b - a)).isZero()) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
