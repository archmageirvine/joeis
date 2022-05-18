package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056774 Composite n such that phi(n+2) = phi(n)+2.
 * @author Sean A. Irvine
 */
public class A056774 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Jaguar.factor(mN + 2).phi().equals(Jaguar.factor(mN).phi().add(2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
