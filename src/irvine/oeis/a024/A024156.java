package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024156 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, a+b+c=n that are obtuse.
 * @author Sean A. Irvine
 */
public class A024156 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long s = mN * mN;
    long count = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = a + 1; b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b && 2 * (a + b) > mN && 2 * mN * (a + b) < 2 * a * b + s) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
