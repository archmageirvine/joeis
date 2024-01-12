package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
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
      if (Jaguar.factor(p.subtract(1)).sigma().equals(Jaguar.factor(p.add(1)).sigma())) {
        return p;
      }
    }
  }
}
