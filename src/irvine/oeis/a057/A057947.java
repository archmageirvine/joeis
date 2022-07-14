package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057947 n has ambiguous representations in "bad hexadecimal": numbers with the digit 1 followed by a digit less than 6.
 * @author Sean A. Irvine
 */
public class A057947 implements Sequence {

  private long mN = 9;

  private boolean is(long n) {
    boolean wasLessSix = false;
    while (n != 0) {
      final long r = n % 10;
      if (wasLessSix && r == 1) {
        return false;
      }
      wasLessSix = r < 6;
      n /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (!is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
