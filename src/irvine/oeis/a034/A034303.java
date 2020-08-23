package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034303 Prime; becomes nonprime if any digit deleted (zeros not allowed in the number).
 * @author Sean A. Irvine
 */
public class A034303 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 10;

  private boolean isDelNonPrime(final String s) {
    for (int k = 0; k < s.length(); ++k) {
      if (mPrime.isPrime(Long.parseLong(s.substring(0, k) + s.substring(k + 1)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final String s = String.valueOf(mP);
      if (!s.contains("0") && isDelNonPrime(s)) {
        return Z.valueOf(mP);
      }
    }
  }
}
