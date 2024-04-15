package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067891 Primes p such that sigma(p+1) = sigma(p-1).
 * @author Sean A. Irvine
 */
public class A067891 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.SIGMA.z(p.subtract(1)).equals(Functions.SIGMA.z(p.add(1)))) {
        return p;
      }
    }
  }
}
