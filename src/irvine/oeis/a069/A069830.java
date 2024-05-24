package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069830 Multiplicative inverse of prime(n) modulo prime(n+1).
 * @author Sean A. Irvine
 */
public class A069830 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.modInverse(mPrime.nextPrime(p));
  }
}

