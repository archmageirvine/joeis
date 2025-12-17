package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391072 allocated for Leif Nordqvist.
 * @author Sean A. Irvine
 */
public class A391072 extends A000040 {

  private Z mProd = Z.ONE;
  private long mP = 2;

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ZERO;
    }
    if (Z.THREE.equals(p)) {
      return Z.TWO;
    }
    mP = mPrime.nextPrime(mP);
    mProd = mProd.multiply(mP - 2);
    return mProd.multiply(p);
  }
}
