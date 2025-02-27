package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075557 a(n) is the smallest odd prime such that (1) a(n) doesn't already appear in the sequence; (2) the n-th partial sum is divisible by n; and (3) the n-th partial sum is relatively prime to n+1.
 * @author Sean A. Irvine
 */
public class A075557 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z s = mSum.add(p);
      if (s.mod(mN) == 0 && Functions.GCD.l(mN + 1, s) == 1 && mUsed.add(p)) {
        mSum = s;
        return Z.valueOf(p);
      }
    }
  }
}

