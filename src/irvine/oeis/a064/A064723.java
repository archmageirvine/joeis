package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;

/**
 * A064723 (L(p)-1)/p where L() are the Lucas numbers (A000032) and p runs through the primes.
 * @author Sean A. Irvine
 */
public class A064723 extends Sequence0 {

  // I think the offset of this sequence should really be 1, but painful to change

  private final Fast mPrime = new Fast();
  private final Sequence mLucas = new A000032();
  private long mP = 1;
  private long mM = -1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (++mM < mP) {
      mLucas.next();
    }
    return mLucas.next().subtract(1).divide(mP);
  }
}
