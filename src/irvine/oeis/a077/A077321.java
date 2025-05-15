package irvine.oeis.a077;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077321 Rearrange primes so as to form a triangle in which n-th row contains the n smallest primes == 1 (mod n) which have not occurred earlier.
 * @author Sean A. Irvine
 */
public class A077321 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.TWO; // avoid need for 1 % mN below
      }
      mM = 0;
      mP = 1;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % mN == 1 && mUsed.add(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
