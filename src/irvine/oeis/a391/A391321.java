package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A391321 Primes of the form 3*p+2 in which p and p+2 are twin primes.
 * @author Sean A. Irvine
 */
public class A391321 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().multiply(3).add(2);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
