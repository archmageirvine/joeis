package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A024624 <code>a(n) =</code> position of square of n-th prime among the powers of primes <code>(A000961)</code>.
 * @author Sean A. Irvine
 */
public class A024624 extends A000961 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z p2 = mP.square();
    while (true) {
      ++mN;
      if (super.next().equals(p2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
