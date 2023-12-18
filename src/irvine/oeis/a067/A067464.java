package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067464 Primes p such that sigma(p-1)+sigma(p+1) is prime.
 * @author Sean A. Irvine
 */
public class A067464 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.subtract(1)).sigma().add(Jaguar.factor(p.add(1)).sigma()).isProbablePrime()) {
        return p;
      }
    }
  }
}

