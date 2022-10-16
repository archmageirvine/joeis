package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A059960 Smaller term of a pair of twin primes such that prime factors of their average are only 2 and 3.
 * @author Sean A. Irvine
 */
public class A059960 extends A003586 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z m = t.subtract(1);
      if (m.isProbablePrime() && t.add(1).isProbablePrime()) {
        return m;
      }
    }
  }
}
