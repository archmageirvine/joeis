package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048227 a(n)=T(n,2), array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048227 extends A048224 {

  {
    setOffset(2);
  }

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.subtract(t);
  }
}
