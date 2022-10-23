package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083758 Lexicographically earliest infinite sequence of distinct primes such that the concatenation of the initial n terms is a prime for all n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A083758 extends Sequence1 {

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

