package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065084.
 * @author Sean A. Irvine
 */
public class A065084 extends Sequence0 {

  // After Washington Bomfim

  private int mN = -1;

  private Z m(final int n) {
    final Z s = Z.ONE.shiftLeft(2L * n);
    return s.subtract(1).divide(3).add(s).subtract(Z.ONE.shiftLeft(2L * n - 2));
  }

  private Z t1(final int n, Z k) {
    Z pow2 = Z.ONE.shiftLeft(2L * n - 2);
    k = k.add(pow2);
    for (int j = 1; j <= n - 2; ++j) {
      pow2 = pow2.shiftRight(2);
      k = k.subtract(pow2);
      if (k.isProbablePrime()) {
        return k;
      }
      k = k.add(pow2);
    }
    return k;
  }

  private Z t2(final int n, Z k) {
    Z pow2 = Z.TWO;
    for (int j = 1; j <= n; ++j) {
      k = k.add(pow2);
      if (k.isProbablePrime()) {
        return k;
      }
      k = k.subtract(pow2);
      pow2 = pow2.shiftLeft(2);
    }
    return k;
  }

  @Override
  public Z next() {
    switch (++mN) {
      case 0:
        return Z.THREE;
      case 1:
        return Z.SEVEN;
      case 2:
        return Z.FIVE;
      default:
        if (mN % 3 == 0) {
          return Z.ZERO;
        }
        final Z k = m(mN);
        if (k.isProbablePrime()) {
          return k;
        }
        final Z t1 = t1(mN, k);
        if (t1.isProbablePrime()) {
          return t1;
        }
        final Z t2 = t2(mN, t1);
        if (t2.isProbablePrime()) {
          return t2;
        }
        throw new UnsupportedOperationException();
    }
  }
}
