package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071843 Gives an LCD representation of n.
 * @author Sean A. Irvine
 */
public class A071843 extends Sequence0 {

  private static final long[] DIGITS = {119, 17, 107, 59, 29, 62, 126, 19, 127, 63};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.valueOf(DIGITS[0]);
    }
    long m = mN;
    Z sum = Z.ZERO;
    long shift = 0;
    long t = 1;
    while (t <= m) {
      t *= 10;
      shift += 7;
    }
    do {
      shift -= 7;
      sum = sum.add(Z.valueOf(DIGITS[(int) (m % 10)]).shiftLeft(shift));
      m /= 10;
    } while (m != 0);
    return sum;
  }
}
