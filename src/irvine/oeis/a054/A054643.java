package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054643 Primes prime(n) such that prime(n) + prime(n+1) + prime(n+2) == 0 (mod 3).
 * @author Sean A. Irvine
 */
public class A054643 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA;
      mA = mB;
      mB = super.next();
      if (p.add(mA).add(mB).mod(3) == 0) {
        return p;
      }
    }
  }
}
