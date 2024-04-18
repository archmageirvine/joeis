package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056776 Composite numbers k such that phi(k+12) = phi(k) + 12.
 * @author Sean A. Irvine
 */
public class A056776 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 44;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Functions.PHI.l(mN + 12) == Functions.PHI.l(mN) + 12) {
        return Z.valueOf(mN);
      }
    }
  }
}
