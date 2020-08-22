package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024153 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, a+b+c=n that have integer area.
 * @author Sean A. Irvine
 */
public class A024153 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      return Z.ZERO; // No such triangle with odd perimeter exists
    }
    long count = 0;
    final long p = mN / 2;
    for (long a = 1; a <= mN; ++a) {
      for (long b = 1 + Math.max(a, p - a); b < mN - a; ++b) {
        final long c = mN - a - b;
        if (c > b) {
          final Z t = Z.valueOf(p).multiply(p - a).multiply(p - b).multiply(p - c);
          if (t.signum() > 0 && t.isSquare()) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
