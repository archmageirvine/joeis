package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073679 a(1) = 4, a(n+1) is the smallest composite number &gt; a(n) such that all of the differences a(n+1)-a(n) are distinct primes.
 * @author Sean A. Irvine
 */
public class A073679 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
      return mA;
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p)) {
        final Z t = mA.add(p);
        if (!t.isProbablePrime()) {
          mUsed.add(p);
          mA = t;
          return mA;
          }
      }
    }
  }
}
