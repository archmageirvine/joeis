package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384314 allocated for Frederik P.J. Vandecasteele.
 * @author Sean A. Irvine
 */
public class A384314 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n) {
    long m = n;
    while (m != 0 && m % 3 == 0) {
      m /= 3;
    }
    long parity = m % 3;
    while (m != 0) {
      final long r = m % 3;
      if (r != 0 && r != parity) {
        return false;
      }
      parity = 3 - parity;
      m /= 3;
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

