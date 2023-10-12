package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066391.
 * @author Sean A. Irvine
 */
public class A066391 extends Sequence0 {

  private int mN = -1;

  private boolean is(final long k) {
    if (k % 10 == 0) {
      return false;
    }
    Z s = Z.valueOf(k).pow(3);
    Z[] qr;
    while (!(qr = s.divideAndRemainder(Z.TEN))[1].isZero()) {
      s = qr[0];
    }
    if (s.isZero()) {
      return false;
    }
    int cnt = 0;
    while ((qr = s.divideAndRemainder(Z.TEN))[1].isZero()) {
      if (++cnt > mN) {
        return false;
      }
      s = qr[0];
    }
    if (cnt < mN) {
      return false;
    }
    while (!s.isZero()) {
      qr = s.divideAndRemainder(Z.TEN);
      if (qr[1].isZero()) {
        return false;
      }
      s = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long k = Z.TEN.pow(mN).root(3).longValueExact();
    while (true) {
      if (is(k)) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

