package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a001.A001913;

/**
 * A060261 Denoting 5 consecutive primes by p, q, r, s and t, these are the values of q such that q, r and s have 10 as a primitive root, but p and t do not.
 * @author Sean A. Irvine
 */
public class A060261 extends A001913 {

  @Override
  public Z next() {
    while (true) {
      final Z q = super.next();
      final Z r = mPrime.nextPrime(q);
      if (ZUtils.isPrimitiveRoot(Z.TEN, r)
        && ZUtils.isPrimitiveRoot(Z.TEN, mPrime.nextPrime(r))
        && !ZUtils.isPrimitiveRoot(Z.TEN, mPrime.prevPrime(q))
        && !ZUtils.isPrimitiveRoot(Z.TEN, mPrime.nextPrime(mPrime.nextPrime(r)))) {
        return q;
      }
    }
  }
}
