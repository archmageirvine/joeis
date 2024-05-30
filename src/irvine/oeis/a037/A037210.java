package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037210 Numbers n such that p-n=p#-n#, where p=nextprime(n), n#=nextprime(square root of n), p#=nextprime(square root of p).
 * @author Sean A. Irvine
 */
public class A037210 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 2206;

  @Override
  public Z next() {
    while (true) {
      final long p = mPrime.nextPrime(++mN);
      final long q = mPrime.nextPrime(Functions.SQRT.l(mN));
      final long r = mPrime.nextPrime(Functions.SQRT.l(p));
      if (p - mN == r - q) {
        return Z.valueOf(mN);
      }
    }
  }
}
