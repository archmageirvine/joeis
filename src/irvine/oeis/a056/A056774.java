package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056774 Composite n such that phi(n+2) = phi(n)+2.
 * @author Sean A. Irvine
 */
public class A056774 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Functions.PHI.l(mN + 2) == Functions.PHI.l(mN) + 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
