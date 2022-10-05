package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059734 Carryless 11^n base 10; a(n) is carryless sum of 10*a(n-1) and a(n-1).
 * @author Sean A. Irvine
 */
public class A059734 extends A059692 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : nimProduct(10, mA, 11);
    return mA;
  }
}

