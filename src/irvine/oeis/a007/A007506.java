package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007506 Primes p with property that p divides the sum of all primes &lt;= p.
 * @author Sean A. Irvine
 */
public class A007506 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(mP);
      if (mSum.mod(mP) == 0) {
        return Z.valueOf(mP);
      }
    }
  }
}
