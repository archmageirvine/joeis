package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066366.
 * @author Sean A. Irvine
 */
public class A066392 extends Sequence0 {

  private int mN = -1;

  private boolean is(final long k) {
    Z s = Z.valueOf(k).square();
    Z[] qr;
    // First get rid of any trailing 0s
    while ((qr = s.divideAndRemainder(Z.TEN))[1].isZero()) {
      s = qr[0];
    }
    // Now look for mN zeros
    while (true) {
      while (!(qr = s.divideAndRemainder(Z.TEN))[1].isZero()) {
        s = qr[0];
      }
      if (s.isZero()) {
        return false;
      }
      int cnt = 0;
      while ((qr = s.divideAndRemainder(Z.TEN))[1].isZero()) {
        if (++cnt >= mN) {
          return true;
        }
        s = qr[0];
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long k = Z.TEN.pow(mN).sqrt().longValueExact();
    while (true) {
      if (is(k)) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

