package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A027856 Dan numbers: numbers n of the form <code>2^a*3^b</code> such that <code>n +- 1</code> are twin primes.
 * @author Sean A. Irvine
 */
public class A027856 extends A003586 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.subtract(1).isProbablePrime() && n.add(1).isProbablePrime()) {
        return n;
      }
    }
  }
}
