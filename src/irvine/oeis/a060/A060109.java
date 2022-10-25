package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060097.
 * @author Sean A. Irvine
 */
public class A060109 extends Sequence0 {

  private static final long[] MORSE_DIGITS = {22222, 12222, 11222, 11122, 11112, 11111, 21111, 22111, 22211, 22221};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.valueOf(MORSE_DIGITS[0]);
    }
    final StringBuilder sb = new StringBuilder();
    long m = mN;
    while (m != 0) {
      if (sb.length() > 0) {
        sb.insert(0, 0);
      }
      sb.insert(0, MORSE_DIGITS[(int) (m % 10)]);
      m /= 10;
    }
    return new Z(sb);
  }
}
