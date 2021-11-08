package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052368 Primes p such that p+7! is also prime.
 * @author Sean A. Irvine
 */
public class A052368 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(5040).isProbablePrime()) {
        return p;
      }
    }
  }
}
