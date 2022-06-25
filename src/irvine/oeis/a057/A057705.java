package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A057705 Primorial primes: primes p such that p+1 is a primorial number (A002110).
 * @author Sean A. Irvine
 */
public class A057705 extends A002110 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().subtract(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
