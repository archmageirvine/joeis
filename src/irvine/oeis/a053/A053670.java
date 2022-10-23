package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053670 Least number coprime to n and n+1.
 * @author Sean A. Irvine
 */
public class A053670 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 3;
    while (LongUtils.gcd(mN, p) != 1 || LongUtils.gcd(mN + 1, p) != 1) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
