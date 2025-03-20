package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076093 Squares arising in A076991.
 * @author Sean A. Irvine
 */
public class A076093 extends A076991 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.add(mA).add(t);
  }
}
