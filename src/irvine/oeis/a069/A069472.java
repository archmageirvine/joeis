package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;

/**
 * A069457 Lowest primes in twin packs.
 * @author Sean A. Irvine
 */
public class A069472 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean is(final Z p) {
    if (Z.THREE.equals(p)) {
      return false;
    }
    Z q = p;
    for (int k = 0; k < mN; ++k) {
      final Z r = mPrime.nextPrime(q);
      if (!r.subtract(q).equals(Z.TWO)) {
        return false;
      }
      q = mPrime.nextPrime(r);
    }
    final Z t = mPrime.prevPrime(p);
    if (p.subtract(t).equals(Z.TWO)) {
      return false;
    }
    final Z u = mPrime.prevPrime(t);
    return !t.subtract(u).equals(Z.TWO);
  }

  @Override
  public Z next() {
    ++mN;
    final Sequence twins = new A001359();
    while (true) {
      final Z p = twins.next();
      if (is(p)) {
        return p;
      }
    }
  }
}

