package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A000229 a(n) is the least number such that the n-th prime is the least quadratic nonresidue (not necessarily coprime) modulo a(n).
 * @author Sean A. Irvine
 */
public class A000229 implements Sequence {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();
  private final HashMap<Z, Z> mLeastNonResidue = new HashMap<>();

  private Z leastNonResidue(final Z n) {
    final Z res = mLeastNonResidue.get(n);
    if (res != null) {
      return res;
    }
    Z r = Z.TWO;
    while (r.jacobi(n) != -1) {
      r = mPrime.nextPrime(r);
    }
    mLeastNonResidue.put(n, r);
    return r;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z n = Z.THREE;
    while (!mP.equals(leastNonResidue(n))) {
      n = mPrime.nextPrime(n);
    }
    return n;
  }

}

