package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053669 Smallest prime not dividing n.
 * @author Sean A. Irvine
 */
public class A053669 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (mN % p == 0) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
