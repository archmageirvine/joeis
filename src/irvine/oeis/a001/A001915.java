package irvine.oeis.a001;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001915 Primes p such that the congruence 2^x == 3 (mod p) is solvable.
 * @author Sean A. Irvine
 */
public class A001915 implements Sequence {

  private final Fast mPrime = new Fast();
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mP = Z.ONE;

  protected Z residue() {
    return Z.THREE;
  }

  private boolean testCongruence(final Z p) {
    mSeen.clear();
    final Z t = residue().mod(p);
    Z r = Z.ONE;
    while (!t.equals(r)) {
      if (!mSeen.add(r)) {
        return false;
      }
      r = r.multiply2().mod(p);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (testCongruence(mP)) {
        return mP;
      }
    }
  }
}
