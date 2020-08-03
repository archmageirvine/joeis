package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074459 Number of segments which change from display of a number n to the next number <code>n+1</code> on a 7-segment display: version where <code>'6', '7', '9'</code> use <code>6, 4</code>, resp. 5 segments.
 * @author Sean A. Irvine
 */
public class A074459 implements Sequence {

  // After M. F. Hasler

  private static final long[] DIGITS = {4, 5, 2, 3, 3, 1, 4, 3, 2};
  private long mN = -1;

  private long a(final long n) {
    if (n % 10 == 9) {
      return n > 9 ? 3 + a(n / 10) : 5;
    }
    return DIGITS[(int) (n % 10)];
  }

  @Override
  public Z next() {
    return Z.valueOf(a(++mN));
  }
}
