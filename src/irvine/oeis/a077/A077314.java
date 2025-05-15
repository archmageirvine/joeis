package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a003.A003591;

/**
 * A077314 Primes of the form 2^r*7^s - 1.
 * @author Sean A. Irvine
 */
public class A077314 extends A003591 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
