package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073602 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long q = 1;
    while (true) {
      q = mPrime.nextPrime(q);
      if (!mUsed.contains(q)) {
        final Z s = mSum.add(q);
        if (s.mod(mP) == 0) {
          mUsed.add(q);
          mSum = s;
          return Z.valueOf(q);
        }
      }
    }
  }
}
