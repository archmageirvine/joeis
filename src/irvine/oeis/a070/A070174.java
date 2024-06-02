package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070174 Primes p such that (p^2)! and 2^(p^2)-1 are not relatively prime.
 * @author Sean A. Irvine
 */
public class A070174 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.square();
      if (!Functions.FACTORIAL.z(p2).gcd(Z.ONE.shiftLeft(p2.longValueExact()).subtract(1)).equals(Z.ONE)) {
        return p;
      }
    }
  }
}
