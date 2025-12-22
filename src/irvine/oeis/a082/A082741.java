package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082741 Numbers that have digits consisting only of line segments or both line segments and curves (base 10 digits are 1, 2, 4, 5, 7).
 * @author Sean A. Irvine
 */
public class A082741 extends Sequence1 {

  private static final long[] DIGITS = {7, 1, 2, 4, 5};
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    long m = mN;
    long b = 1;
    while (m > 0) {
      final long d = m % 5;
      m /= 5;
      if (d == 0) {
        --m;
      }
      r += b * DIGITS[(int) d];
      b *= 10;
    }
    return Z.valueOf(r);
  }
}
