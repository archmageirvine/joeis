package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037208 Numbers k such that q^2 &lt; p, where p=nextprime(k), q=nextprime(square root of k).
 * @author Sean A. Irvine
 */
public class A037208 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long p = mPrime.nextPrime(++mN);
      final long q = mPrime.nextPrime(Functions.SQRT.l(mN));
      if (q * q < p) {
        return Z.valueOf(mN);
      }
    }
  }
}
