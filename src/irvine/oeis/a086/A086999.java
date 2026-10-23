
package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002371;
import irvine.oeis.a028.A028416;

/**
 * A086999 Periodic part of decimal expansion of 1/p for those primes having a periodic part of even length.
 * @author Sean A. Irvine
 */
public class A086999 extends A028416 {

  private final DirectSequence mA = new A002371();

  @Override
  public Z next() {
    final Z p = super.next();
    final Z t = Z.TEN.pow(mA.a(Functions.PRIME_PI.l(p)));
    Z res = t.divide(p);
    if (!res.isZero()) {
      Z q;
      while ((q = res.multiply(10)).compareTo(t) < 0) {
        res = q;
      }
    }
    return res;
  }
}
