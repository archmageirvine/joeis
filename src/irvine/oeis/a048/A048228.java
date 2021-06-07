package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048228 a(n)=T(n,3), array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048228 extends A048224 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mC;
    mC = super.next();
    return mC.subtract(t);
  }
}
