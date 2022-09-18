package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A059321 Smallest number m such that m^2+1 is divisible by A002144(n)^2 (= squares of primes congruent to 1 mod 4).
 * @author Sean A. Irvine
 */
public class A059321 extends A002144 {

  @Override
  public Z next() {
    final Z p = super.next().square();
    Z m = p;
    while (!m.subtract(1).isSquare()) {
      m = m.add(p);
    }
    return m.subtract(1).sqrt();
  }
}
