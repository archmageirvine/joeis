package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056776 Composite numbers k such that phi(k+12) = phi(k) + 12.
 * @author Sean A. Irvine
 */
public class A056776 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 44;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Cheetah.factor(mN + 12).phi().equals(Cheetah.factor(mN).phi().add(12))) {
        return Z.valueOf(mN);
      }
    }
  }
}
