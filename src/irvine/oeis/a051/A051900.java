package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051900 Minimal 2^n safe-primes: a(n) = 2^n*A051886(n) + 1 (a prime number).
 * @author Sean A. Irvine
 */
public class A051900 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z q = p.shiftLeft(mN).add(1);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
