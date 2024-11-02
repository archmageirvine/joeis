package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A072846 The a(n)-th highly-composite number (A002182) is the first one divisible by the n-th prime.
 * @author Sean A. Irvine
 */
public class A072846 extends A002182 {

  private final Fast mPrime = new Fast();
  private long mM = 0;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (true) {
      ++mM;
      if (super.next().mod(mP) == 0) {
        return Z.valueOf(mM);
      }
    }
  }
}
