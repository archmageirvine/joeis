package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A038711 a(n) is the smallest m such that A002110(n) + m is prime.
 * @author Sean A. Irvine
 */
public class A038711 extends A002110 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}
