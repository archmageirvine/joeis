package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082720 Digit lengths for which there exist plateau or depression primes of the general form r*(10^m-1)/9 +- s*(10^(m-1)+1).
 * @author Sean A. Irvine
 */
public class A082720 extends Sequence1 {

  private static final char[] PREFIX = {'1', '3', '7', '9'};
  private int mN = 2;

  private boolean is(final int n) {
    for (final char c : PREFIX) {
      for (char d = '0'; d <= '9'; ++d) {
        if (d != c && new Z(c + String.valueOf(d).repeat(n - 2) + c).isProbablePrime()) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
