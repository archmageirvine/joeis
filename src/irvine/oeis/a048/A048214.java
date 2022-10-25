package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004979;

/**
 * A048214 a(n)=T(n,2), array T given by A048212.
 * @author Sean A. Irvine
 */
public class A048214 extends A004979 {

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
