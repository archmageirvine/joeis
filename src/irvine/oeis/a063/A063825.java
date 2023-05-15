package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063825 Numbers k such that k-3, k-5, k-17, k-257, and k-65537 are all primes.
 * @author Sean A. Irvine
 */
public class A063825 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z k = p.add(65537);
      if (k.subtract(3).isProbablePrime() && k.subtract(5).isProbablePrime() && k.subtract(17).isProbablePrime() && k.subtract(257).isProbablePrime()) {
        return k;
      }
    }
  }
}

