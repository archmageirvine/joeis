package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075772 Difference between the n-th perfect power and the closest perfect power.
 * @author Sean A. Irvine
 */
public class A075772 extends A001597 {

  private Z mA = Z.valueOf(-2); // Just so the positive value picked for first term
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.subtract(mA).min(mA.subtract(t));
  }
}
