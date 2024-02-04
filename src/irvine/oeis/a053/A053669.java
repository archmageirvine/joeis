package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A053669 Smallest prime not dividing n.
 * @author Sean A. Irvine
 */
public class A053669 extends Sequence1 implements DirectSequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z a(final Z n) {
    long p = 2;
    while (n.mod(Z.valueOf(p)).isZero()) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }

  @Override
  public Z a(final int n) {
    long p = 2;
    while (n % p == 0) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
