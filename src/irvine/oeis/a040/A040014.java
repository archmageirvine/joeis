package irvine.oeis.a040;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000149;

/**
 * A040014 Number of primes &lt; e^n.
 * @author Sean A. Irvine
 */
public class A040014 extends A000149 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private Z mP = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    while (mP.compareTo(t) <= 0) {
      mP = mPrime.nextPrime(mP);
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
