package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391816 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A391816 extends Sequence0 {

  private long mN = -1;

  private boolean is(Z m, long n) {
    while (n != 0) {
      final long r = n % 10;
      n /= 10;
      while (true) {
        if (m.isZero()) {
          return false;
        }
        final Z[] qr = m.divideAndRemainder(10);
        m = qr[0];
        if (qr[1].longValue() == r) {
          break;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    int e = 1;
    while (true) {
      ++e;
      n = n.multiply(mN);
      if (is(n, mN)) {
        return Z.valueOf(e);
      }
    }
  }
}
