package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065403 Primes of the form sigma(m^2) where m is a composite number ordered by values m.
 * @author Sean A. Irvine
 */
public class A065403 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z s = Functions.SIGMA.z(super.next().square());
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
