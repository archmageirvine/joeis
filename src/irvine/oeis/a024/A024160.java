package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024160 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, <code>a+b+c=n</code> such that <code>(c-b)(c-a)(b-a)</code> divides <code>(c+b)(c+a)(b+a)</code>.
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
        if (c > b && a + b > c && Z.ZERO.equals(Z.valueOf(b + c).multiply(c + a).multiply(a + b).mod(Z.valueOf(c - b).multiply(c - a).multiply(b - a)))) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
