package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075608 a(1) = 1, a(n) = smallest composite number not occurring earlier such that the concatenation a(n-1) and a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A075608 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final String s = mA.toString();
    long k = 7;
    while (true) {
      k += 2;
      if (!mPrime.isPrime(k) && !mUsed.contains(k)) {
        final Z t = new Z(s + k);
        if (t.isProbablePrime()) {
          mUsed.add(k);
          mA = Z.valueOf(k);
          return mA;
        }
      }
    }
  }
}

