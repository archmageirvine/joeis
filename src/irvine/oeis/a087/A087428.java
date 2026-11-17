package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A087428 a(n) = [(p-1)/2 * (q-1)/2] mod p where p = (n+1)th odd prime, q = n-th odd prime.
 * @author Sean A. Irvine
 */
public class A087428 extends A065091 {

  @Override
  public Z next() {
    final Z q = super.next();
    final Z p = mPrime.nextPrime(q);
    return p.divide2().modMultiply(q.divide2(), p);
  }
}
