package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062357 a(n) = n*p(n+1)-(n+1)*p(n) = n*d(n)-p(n), where p(n) is the n-th prime and d(n) is the n-th prime-difference, A001223(n).
 * @author Sean A. Irvine
 */
public class A062357 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;

  @Override
  public Z next() {
    ++mN;
    final long p = mP;
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mN).multiply(mP).subtract(Z.valueOf(mN + 1).multiply(p));
  }
}
