package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024157 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, <code>a+b+c=n</code> such that n divides abc.
 * @author Sean A. Irvine
 */
public class A024157 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b && a + b > c) {
          if (Z.valueOf(a).multiply(b).multiply(c).mod(mN) == 0) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
