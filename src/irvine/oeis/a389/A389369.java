package irvine.oeis.a389;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389369 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A389369 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z prod = Z.ONE;
    Z sum = Z.ZERO;
    long q = 2;
    for (long k = 0; k < mN; ++k, q = mPrime.nextPrime(q)) {
      prod = prod.multiply(q);
      sum = sum.add(q);
    }
    long p = 2;
    while (!prod.subtract(sum).isProbablePrime()) {
      prod = prod.divide(p);
      sum = sum.subtract(p);
      prod = prod.multiply(q);
      sum = sum.add(q);
      p = mPrime.nextPrime(p);
      q = mPrime.nextPrime(q);
    }
    return Z.valueOf(p);
  }
}
