package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045574 Still numbers when turned upside down (uses only digits 0, 1, 6, 8, 9 with no final 0's).
 * @author Sean A. Irvine
 */
public class A045574 extends Sequence1 {

  private static final char[] DIGITS = {'0', '1', '6', '8', '9'};
  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    }
    if (++mN % 5 == 0) {
      ++mN;
    }
    final StringBuilder sb = new StringBuilder();
    long m = mN;
    while (m != 0) {
      sb.append(DIGITS[(int) (m % 5)]);
      m /= 5;
    }
    return new Z(sb.reverse());
  }
}
