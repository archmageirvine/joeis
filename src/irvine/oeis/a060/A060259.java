package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a001.A001913;

/**
 * A060259 Denoting 4 consecutive primes by p, q, r and s, these are the values of q such that q and r have 10 as a primitive root, but p and s do not.
 * @author Sean A. Irvine
 */
public class A060259 extends A001913 {

  @Override
  public Z next() {
    while (true) {
      final Z q = super.next();
      final Z r = mPrime.nextPrime(q);
      if (ZUtils.isPrimitiveRoot(Z.TEN, r)
        && !ZUtils.isPrimitiveRoot(Z.TEN, mPrime.nextPrime(r))
        && !ZUtils.isPrimitiveRoot(Z.TEN, mPrime.prevPrime(q))) {
        return q;
      }
    }
  }
}
