package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071612 a(n) is the smallest prime that is the first of n consecutive primes which are all emirps.
 * @author Sean A. Irvine
 */
public class A071612 extends A000040 {

  private long mN = 0;
  private long mM = 0;
  private Z mP = null;

  @Override
  public Z next() {
    ++mN;
    while (mM < mN) {
      mP = super.next();
      Z q = mP;
      mM = 0;
      while (Predicates.EMIRP.is(q)) {
        ++mM;
        q = mPrime.nextPrime(q);
      }
    }
    return mP;
  }
}
