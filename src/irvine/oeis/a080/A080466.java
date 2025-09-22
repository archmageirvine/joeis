package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080466 Multiples of 11 in which the even positioned digits from left are even and the odd positioned ones are odd.
 * @author Sean A. Irvine
 */
public class A080466 extends Sequence1 {

  private long mN = 110;

  private boolean is(long n) {
    final long parity = n & 1;
    while (n != 0) {
      if ((n & 1) != parity) {
        return false;
      }
      n /= 10;
      if (n == 0) {
        return parity == 1;
      }
      if ((n & 1) == parity) {
        return false;
      }
      n /= 10;
    }
    return parity == 0;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 11;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

