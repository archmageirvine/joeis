package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058620 Lesser of two consecutive primes whose difference divided by two is a prime: ( prime(next prime after n) - prime(n) )/2 is prime.
 * @author Sean A. Irvine
 */
public class A058620 extends A000040 {

  {
    super.next(); // skip 2
  }
  Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP;
      mP = super.next();
      if (mP.subtract(p).divide2().isProbablePrime()) {
        return p;
      }
    }
  }
}
