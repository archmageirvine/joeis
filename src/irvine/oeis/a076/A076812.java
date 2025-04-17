package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076812 a(n) = the smallest prime p such that p-prime(n)*4 is prime.
 * @author Sean A. Irvine
 */
public class A076812 extends A000040 {

  @Override
  public Z next() {
    final Z p2 = super.next().multiply(4);
    Z q = p2;
    while (true) {
      q = mPrime.nextPrime(q);
      if (q.subtract(p2).isProbablePrime()) {
        return q;
      }
    }
  }
}
