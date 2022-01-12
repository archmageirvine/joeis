package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053671 Least number coprime to n, n+1 and n+2.
 * @author Sean A. Irvine
 */
public class A053671 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 5;
    while (LongUtils.gcd(mN, p) != 1 || LongUtils.gcd(mN + 1, p) != 1 || LongUtils.gcd(mN + 2, p) != 1) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
