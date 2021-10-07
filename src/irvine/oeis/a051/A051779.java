package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A051779 Primes of form pq + 2 where p and q are twin primes.
 * @author Sean A. Irvine
 */
public class A051779 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.multiply(p.add(2)).add(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
