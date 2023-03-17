package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056773 Composite n such that phi(n+4) = phi(n)+4.
 * @author Sean A. Irvine
 */
public class A056773 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Euler.phiAsLong(mN + 4) == Euler.phiAsLong(mN) + 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
