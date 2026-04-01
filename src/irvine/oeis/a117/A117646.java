package irvine.oeis.a117;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A117646 Sets of three consecutive primes with equal gaps: prime(n) + 2*m = prime(n+1) and prime(n+1) + 2*m = prime(n+2) for some m.
 * @author Sean A. Irvine
 */
public class A117646 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mQ = 3;
  private long mR = 5;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      if (mQ - mP == mR - mQ) {
        mA.add(mP);
        mA.add(mQ);
        mA.add(mR);
      }
      mP = mQ;
      mQ = mR;
      mR = mPrime.nextPrime(mR);
    }
    return Z.valueOf(mA.pollFirst());
  }
}

