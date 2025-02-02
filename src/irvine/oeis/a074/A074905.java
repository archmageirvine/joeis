package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a030.A030229;

/**
 * A074905 a(n) = number of terms in A030229 between prime(n) and prime(n+1).
 * @author Sean A. Irvine
 */
public class A074905 extends A030229 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mA = super.next().longValueExact();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = mPrime.nextPrime(mP);
    long cnt = 0;
    while (mA <= mP) {
      mA = super.next().longValueExact();
    }
    while (mA < q) {
      ++cnt;
      mA = super.next().longValueExact();
    }
    return Z.valueOf(cnt);
  }
}
