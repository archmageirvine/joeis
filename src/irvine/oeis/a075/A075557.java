package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075533.
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

