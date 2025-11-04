package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386607 allocated for Pieter Post.
 * @author Sean A. Irvine
 */
public class A386607 extends Sequence0 {

  private long mNextZero = 10;
  private long mN = -1;

  private boolean is(final long n, Z m) {
    long sum = 0;
    long sign = 1;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(Z.TEN);
      sum += qr[1].longValue() * sign;
      sign = -sign;
      m = qr[0];
    }
    return Math.abs(sum) == n;
  }

  @Override
  public Z next() {
    if (++mN == mNextZero) {
      mNextZero *= 10;
      return Z.ZERO;
    }
    long b = 1;
    Z nb = Z.valueOf(mN);
    while (true) {
      ++b;
      nb = nb.multiply(mN);
      if (is(mN, nb)) {
        return Z.valueOf(b);
      }
    }
  }
}
