package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002371;

/**
 * A060283 Periodic part of decimal expansion of reciprocal of n-th prime (leading 0's moved to end).
 * @author Sean A. Irvine
 */
public class A060283 extends A002371 {

  @Override
  public Z next() {
    final Z t = Z.TEN.pow(super.next());
    Z res = t.divide(mP);
    if (!res.isZero()) {
      Z q;
      while ((q = res.multiply(10)).compareTo(t) < 0) {
        res = q;
      }
    }
    return res;
  }
}
