package irvine.oeis.a116;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A116536 Numbers that can be expressed as the ratio of the product and the sum of consecutive prime numbers starting from 2.
 * @author Sean A. Irvine
 */
public class A116536 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mProd = Z.ONE;
  private Z mSum = Z.ZERO;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mProd = mProd.multiply(mP);
      mSum = mSum.add(mP);
      final Z[] qr = mProd.divideAndRemainder(mSum);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
