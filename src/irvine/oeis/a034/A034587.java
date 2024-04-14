package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034587 Fibonacci iteration starting with (1, a(n)) leads to a "nine digits anagram".
 * @author Sean A. Irvine
 */
public class A034587 extends Sequence1 {

  private static final int NINE_DIGITS = 0b1111111110;
  private long mN = 717;

  private boolean is(final long n) {
    long a = 1;
    long b = n;
    while (true) {
      final long t = a + b;
      if (t >= 1000000000L) {
        break; // too big
      }
      if (Functions.SYNDROME.i(t) == NINE_DIGITS) {
        return true;
      }
      a = b;
      b = t;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 987654320) {
        return null; // sequence is finite
      }
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
