package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049232 Primes p such that p+2 is divisible by a square.
 * @author Sean A. Irvine
 */
public class A049232 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Jaguar.factor(p.add(2)).isSquareFree()) {
        return p;
      }
    }
  }
}
