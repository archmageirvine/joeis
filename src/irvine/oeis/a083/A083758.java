package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A083758 Beginning with 2, rearrangement of primes (other than 5) such that every concatenation beginning with the first term is a prime.
 * @author Sean A. Irvine
 */
public class A083758 implements Sequence {

  private final HashSet<Long> mUsed = new HashSet<>();
  {
    mUsed.add(5L);
  }
  private String mConcatenation = "";
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p)) {
        final String s = mConcatenation + String.valueOf(p);
        final Z candidate = new Z(s);
        if (mPrime.isPrime(candidate)) {
          mConcatenation = s;
          mUsed.add(p);
          return Z.valueOf(p);
        }
      }
    }
  }
}

