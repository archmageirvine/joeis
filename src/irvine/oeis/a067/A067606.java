package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067606 Primes p such that p+7 == 0 (mod phi(p+7)).
 * @author Sean A. Irvine
 */
public class A067606 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p7 = p.add(7);
      if (p7.mod(Functions.PHI.z(p7)).isZero()) {
        return p;
      }
    }
  }
}

