package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073580.
 * @author Sean A. Irvine
 */
public class A073670 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private final Fast mPrime = new Fast();
  private Z mSum = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN)) {
      return mSum;
    }
    long k = mPrime.isPrime(mN) ? 1 : 0;
    while (true) {
      final Z t = mN.multiply(++k);
      final Z s = mSum.add(t);
      if (s.isProbablePrime() && mUsed.add(t)) {
        mSum = s;
        return t;
      }
    }
  }
}
