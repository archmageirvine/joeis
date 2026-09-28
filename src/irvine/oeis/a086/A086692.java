package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086692 Number of primes &lt; 3^prime(n).
 * @author Sean A. Irvine
 */
public class A086692 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mQ = 2;
  private long mP = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    final long lim = Z.THREE.pow(mQ).longValueExact();
    while (mP < lim) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    mQ = Functions.NEXT_PRIME.l(mQ);
    return Z.valueOf(mCount - 1);
  }
}
