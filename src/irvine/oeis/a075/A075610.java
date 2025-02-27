package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075610 a(1) = 1, a(n) = smallest prime number not occurring earlier such that the concatenation a(n-1) and a(n) is a composite number.
 * @author Sean A. Irvine
 */
public class A075610 extends Sequence1 {

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
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p)) {
        final Z t = new Z(s + p);
        if (!t.isProbablePrime()) {
          mUsed.add(p);
          mA = Z.valueOf(p);
          return mA;
        }
      }
    }
  }
}

