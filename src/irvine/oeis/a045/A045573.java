package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045573.
 * @author Sean A. Irvine
 */
public class A045573 implements Sequence {

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
