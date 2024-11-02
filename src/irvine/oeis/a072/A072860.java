package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a002.A002371;

/**
 * A072860 Highest power of 3 dividing the period length of 1/prime(n) = A002371(n).
 * @author Sean A. Irvine
 */
public class A072860 extends A002371 {

  @Override
  public Z next() {
    Z s = super.next();
    if (s.isZero()) {
      return Z.ZERO;
    }
    Z t = Z.ONE;
    while (s.mod(3) == 0) {
      t = t.multiply(3);
      s = s.divide(3);
    }
    return t;
  }
}
