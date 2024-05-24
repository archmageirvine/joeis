package irvine.oeis.a069;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A069793 Find smallest k such that prime(k) and prime(n+k) use the same digits; sequence gives prime(k).
 * @author Sean A. Irvine
 */
public class A069793 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long p = mP;
    long q = 1;
    while (true) {
      q = mPrime.nextPrime(q);
      if (Arrays.equals(ZUtils.digitCounts(q), ZUtils.digitCounts(p))) {
        return Z.valueOf(q);
      }
      p = mPrime.nextPrime(p);
    }
  }
}

