package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053875.
 * @author Sean A. Irvine
 */
public class A053976 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mT = 0;

  @Override
  public Z next() {
    mT = mT == 0 ? 1 : mT * 10;
    long p = 2;
    long q;
    while ((q = mPrime.nextPrime(p)) - p < mT) {
      p = q;
    }
    return Z.valueOf(p);
  }
}
