package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A045616 Primes p such that 10^(p-1) == 1 (mod p^2).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A045616 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.ONE.equals(Z.TEN.modPow(p.subtract(1), p.square()))) {
        return p;
      }
    }
  }
}
