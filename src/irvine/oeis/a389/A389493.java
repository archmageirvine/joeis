package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389493 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A389493 extends Sequence1 {

  private long mN = 5;

  private boolean isRepunit(final Z n) {
    Z t = n.multiply(9).add(1);
    while (!t.isOne()) {
      final Z[] qr =t.divideAndRemainder(Z.TEN);
      if (!qr[1].isZero()) {
        return false;
      }
      t = qr[0];
    }
    return true;
  }

  private boolean is(final long n) {
    final Z ns = Z.valueOf(n).square();
    for (long k = 1; k < n; ++k) {
      if (isRepunit(ns.subtract(Z.valueOf(k).square()))) {
        return true;
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
