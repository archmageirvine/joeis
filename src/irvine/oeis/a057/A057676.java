package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057676 Smallest prime q(n) such that -q(n)+2^p(n) is a prime, where p(n) = n-th prime.
 * @author Sean A. Irvine
 */
public class A057676 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z q = Z.ONE.shiftLeft(super.next().longValueExact());
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (q.subtract(p).abs().isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
