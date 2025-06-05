package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077646 Solutions to lcm(n, tau(n)) = 2n which are neither prime nor twice a prime, where tau(k) = d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A077646 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if ((c.isOdd() || !c.divide2().isProbablePrime()) && Functions.LCM.z(c, Functions.SIGMA0.z(c)).equals(c.multiply2())) {
        return c;
      }
    }
  }
}
