package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A038710 a(n) is the smallest prime &gt; product of the first n primes (A002110(n)).
 * @author Sean A. Irvine
 */
public class A038710 extends A002110 {

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
