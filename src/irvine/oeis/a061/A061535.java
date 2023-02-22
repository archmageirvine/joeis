package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061535 a(n) = a(n-1) + the number of primes &lt;= a(n-1).
 * @author Sean A. Irvine
 */
public class A061535 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mA = 0;
  private long mC = 0;
  private long mP = 2;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 2;
    } else {
      while (mP <= mA) {
        ++mC;
        mP = mPrime.nextPrime(mP);
      }
      mA += mC;
    }
    return Z.valueOf(mA);
  }
}
