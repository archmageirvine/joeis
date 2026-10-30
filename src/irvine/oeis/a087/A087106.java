package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A087106 Primes of the form (prime(k-1)+1)*(prime(k+1)-1) + 1, k&gt;1.
 * @author Sean A. Irvine
 */
public class A087106 extends A065091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = mPrime.prevPrime(p).add(1).multiply(mPrime.nextPrime(p).subtract(1)).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
