package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045573 Still numbers when turned upside down (only uses digits 0125689, with no final 0's).
 * @author Sean A. Irvine
 */
public class A045573 extends Sequence1 {

  private static final char[] DIGITS = {'0', '1', '2', '5', '6', '8', '9'};
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 7 == 0) {
      ++mN;
    }
    final StringBuilder sb = new StringBuilder();
    long m = mN;
    while (m != 0) {
      sb.append(DIGITS[(int) (m % 7)]);
      m /= 7;
    }
    return new Z(sb.reverse());
  }
}
