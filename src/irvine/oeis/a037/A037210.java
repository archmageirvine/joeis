package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037210 Numbers n such that p-n=p#-n#, where p=nextprime(n), n#=nextprime(square root of n), p#=nextprime(square root of p).
 * @author Sean A. Irvine
 */
public class A037210 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2206;

  @Override
  public Z next() {
    while (true) {
      final long p = mPrime.nextPrime(++mN);
      final long q = mPrime.nextPrime(LongUtils.sqrt(mN));
      final long r = mPrime.nextPrime(LongUtils.sqrt(p));
      if (p - mN == r - q) {
        return Z.valueOf(mN);
      }
    }
  }
}
