package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056773 Composite n such that phi(n+4) = phi(n)+4.
 * @author Sean A. Irvine
 */
public class A056773 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Jaguar.factor(mN + 4).phi().equals(Jaguar.factor(mN).phi().add(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
