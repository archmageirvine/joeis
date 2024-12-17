package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073704 Smallest prime p such that also p-prime(n)*2 is a prime.
 * @author Sean A. Irvine
 */
public class A073704 extends A000040 {

  @Override
  public Z next() {
    final Z p2 = super.next().multiply2();
    Z q = p2;
    while (true) {
      q = mPrime.nextPrime(q);
      if (q.subtract(p2).isProbablePrime()) {
        return q;
      }
    }
  }
}
