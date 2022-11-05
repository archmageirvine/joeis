package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A060260 Numbers k such that prime(k), prime(k+1) and prime(k+2) have 10 as a primitive root, but prime(k-1) and prime(k+3) do not.
 * @author Sean A. Irvine
 */
public class A060260 extends A060257 {

  @Override
  public Z next() {
    while (true) {
      super.next();
      final Z r = mPrime.nextPrime(mP);
      if (ZUtils.isPrimitiveRoot(Z.TEN, r)
        && ZUtils.isPrimitiveRoot(Z.TEN, mPrime.nextPrime(r))
        && !ZUtils.isPrimitiveRoot(Z.TEN, mPrime.prevPrime(mP))
        && !ZUtils.isPrimitiveRoot(Z.TEN, mPrime.nextPrime(mPrime.nextPrime(r)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
