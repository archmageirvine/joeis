package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001914 Cyclic numbers: 10 is a quadratic residue modulo p and class of mantissa is 2.
 * @author Sean A. Irvine
 */
public class A001914 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  // There is likely a much better way than explicitly checking these...
  private boolean checkRepunit(final Z p) {
    if (Z.THREE.equals(p) || Z.FIVE.equals(p)) {
      return false;
    }
    Z q = Z.TWO;
    final Z lim = p.subtract(1).divide(2);
    Z r = Z.ONE;
    while (q.compareTo(lim) < 0) {
      r = r.multiply(Z.TEN).add(1).mod(p);
      if (Z.ZERO.equals(r)) {
        return false;
      }
      q = q.add(1);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.TEN.jacobi(mP) >= 0 && checkRepunit(mP)) {
        return mP;
      }
    }
  }
}
