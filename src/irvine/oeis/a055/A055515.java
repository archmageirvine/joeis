package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055515 a(n) = (2^n - 1)/product(2^p - 1) where the product is over all distinct primes p that divide n.
 * @author Sean A. Irvine
 */
public class A055515 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft(++mN).subtract(1);
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      t = t.divide(Z.ONE.shiftLeft(p.longValue()).subtract(1));
    }
    return t;
  }
}
