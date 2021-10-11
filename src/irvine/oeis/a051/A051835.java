package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A051835 Palindromic Sophie Germain primes.
 * @author Sean A. Irvine
 */
public class A051835 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply2().add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
