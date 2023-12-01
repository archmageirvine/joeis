package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067028 Numbers with a composite number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A067028 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && !mPrime.isPrime(Jaguar.factor(mN).bigOmega())) {
        return Z.valueOf(mN);
      }
    }
  }
}
