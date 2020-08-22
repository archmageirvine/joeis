package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307913 Numbers without the decimal digits 3, 6 and 9.
 * @author Sean A. Irvine
 */
public class A307913 implements Sequence {

  private long mN = -1;

  private boolean is(long n) {
    while (n != 0) {
      final long r = n % 10;
      if (r == 3 || r == 6 || r == 9) {
        return false;
      }
      n /= 10;
    }
    return true;
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
