package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001097;

/**
 * A087394 Prime(prime(n)) when prime(prime(n)) and n are twin primes.
 * @author Sean A. Irvine
 */
public class A087394 extends A001097 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = Functions.PRIME.z(Functions.PRIME.z(p));
      if (q.subtract(2).isProbablePrime() || q.add(2).isProbablePrime()) {
        return q;
      }
    }
  }
}

