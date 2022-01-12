package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053674 Least number coprime to n, n+1, n+2, n+3, n+4 and n+5.
 * @author Sean A. Irvine
 */
public class A053674 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 7;
    while (LongUtils.gcd(mN, p) != 1
      || LongUtils.gcd(mN + 1, p) != 1
      || LongUtils.gcd(mN + 2, p) != 1
      || LongUtils.gcd(mN + 3, p) != 1
      || LongUtils.gcd(mN + 4, p) != 1
      || LongUtils.gcd(mN + 5, p) != 1
    ) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
