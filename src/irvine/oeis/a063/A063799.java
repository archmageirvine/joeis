package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063799 Numbers k such that (k+3, k+5, k+17, k+257, k+65537) are all primes.
 * @author Sean A. Irvine
 */
public class A063799 extends A000040 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next().subtract(3);
      if (k.add(5).isProbablePrime() && k.add(17).isProbablePrime() && k.add(257).isProbablePrime() && k.add(65537).isProbablePrime()) {
        return k;
      }
    }
  }
}

