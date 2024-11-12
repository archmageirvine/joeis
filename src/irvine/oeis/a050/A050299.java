package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050299 Numbers k such that ((k-1)! + 1)/k is prime.
 * @author Sean A. Irvine
 */
public class A050299 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private boolean mFirst = true;
  private long mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    while (true) {
      mF = mF.multiply(mN++);
      if (mPrime.isPrime(mN)) {
        final Z[] qr = mF.add(1).divideAndRemainder(Z.valueOf(mN));
        if (qr[1].isZero() && qr[0].isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
