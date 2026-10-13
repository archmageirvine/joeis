package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A086870 Primes equal to a product of twin primes minus 1 divided by 2.
 * @author Sean A. Irvine
 */
public class A086870 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.multiply(p.add(2)).subtract(1).divide2();
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}

