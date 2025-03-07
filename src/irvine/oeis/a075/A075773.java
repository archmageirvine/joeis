package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075773 Let {b(n)} be the sequence of perfect powers (A001597); then a(n) = max { b(n)-b(n-1), b(n+1)-b(n) }.
 * @author Sean A. Irvine
 */
public class A075773 extends A001597 {

  private Z mA = Z.ZERO;
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.subtract(mA).max(mA.subtract(t));
  }
}
