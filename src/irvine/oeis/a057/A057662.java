package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057662 Smallest prime q such that q+2^prime(n) is a prime, where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A057662 extends A000040 {

  @Override
  public Z next() {
    final Z a = Z.ONE.shiftLeft(super.next().intValueExact());
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (a.add(p).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
