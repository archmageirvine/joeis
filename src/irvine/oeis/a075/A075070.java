package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a036.A036691;

/**
 * A075070 a(n) = n-th compositorial number / (product of those primes which divide the n-th compositorial number).
 * @author Sean A. Irvine
 */
public class A075070 extends A036691 {

  @Override
  public Z next() {
    Z c = super.next();
    for (final Z p : Jaguar.factor(c).toZArray()) {
      c = c.divide(p);
    }
    return c;
  }
}

