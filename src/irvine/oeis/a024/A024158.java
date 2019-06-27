package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024158 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, <code>a+b+c=n</code> such that <code>(c-b)(c-a)(b-a)</code> divides <code>(b+c-a)(c+a-b)(a+b-c)</code>.
 * @author Sean A. Irvine
 */
public class A024158 implements Sequence {

  // todo doesn't match sequence values

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b && a + b > c) {
          //final Z u = Z.valueOf(b + c - a).multiply(c + a - b).multiply(a + b - c);
          final Z u = Z.valueOf(b + c - a).multiply(c + a - b).multiply(a + b - c);
          final Z v = Z.valueOf(c - b).multiply(c - a).multiply(b - a);
          if (Z.ZERO.equals(u.mod(v))) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
