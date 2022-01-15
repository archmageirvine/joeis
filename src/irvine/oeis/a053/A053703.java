package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A053703 Primes q of form q=p^w+2 where p is odd prime, w&gt;=2.
 * @author Sean A. Irvine
 */
public class A053703 extends A025475 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next().add(2);
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
