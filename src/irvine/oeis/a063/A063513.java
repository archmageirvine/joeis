package irvine.oeis.a063;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a023.A023897;

/**
 * A063513 Least balanced numbers (A020492): m such that the quotient sigma(m)/phi(m) equals the n-th prime.
 * @author Sean A. Irvine
 */
public class A063513 extends A023897 {

  private final Fast mPrime = new Fast();
  private final HashMap<Z, Long> mFirsts = new HashMap<>();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (!mFirsts.containsKey(mP)) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        mFirsts.putIfAbsent(t, mN);
      }
    }
    return Z.valueOf(mFirsts.get(mP));
  }
}
