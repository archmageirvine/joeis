package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065897 The a(n)-th composite number is twice the n-th prime.
 * @author Sean A. Irvine
 */
public class A065897 extends A002808 {

  private final Fast mPrime = new Fast();
  private long mM = 0;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z s = mP.multiply2();
    while (true) {
      ++mM;
      if (s.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
