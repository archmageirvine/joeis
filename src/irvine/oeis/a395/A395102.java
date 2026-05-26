package irvine.oeis.a395;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395102 a(1) = 3; a(n) is the smallest odd prime not occurring earlier so that a(n) mod a(n-1) is prime.
 * @author Sean A. Irvine
 */
public class A395102 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mA = 0;
  private long mP = 5;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 3;
      return Z.THREE;
    }
    while (mUsed.remove(mP)) {
      mP = mPrime.nextPrime(mP);
    }
    long q = mP;
    while (!mPrime.isPrime(q % mA)) {
      q = mPrime.nextPrime(q);
    }
    mUsed.add(q);
    mA = q;
    return Z.valueOf(q);
  }
}

