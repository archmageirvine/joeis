package irvine.oeis.a359;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359115 a(n) is the smallest odd prime not already in the sequence such that when the terms a(1)..a(n) are concatenated, the result is the reverse of a prime.
 * @author Sean A. Irvine
 */
public class A359115 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final Fast mPrime = new Fast();
  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p) && new Z(new StringBuilder(mA).append(p).reverse()).isProbablePrime()) {
        mUsed.add(p);
        mA.append(p);
        return Z.valueOf(p);
      }
    }
  }
}

