package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037208 Numbers n such that q^2 &lt; p, where p=nextprime(n), q=nextprime(square root of n).
 * @author Sean A. Irvine
 */
public class A037208 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long p = mPrime.nextPrime(++mN);
      final long q = mPrime.nextPrime(LongUtils.sqrt(mN));
      if (q * q < p) {
        return Z.valueOf(mN);
      }
    }
  }
}
