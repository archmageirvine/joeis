package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004979;

/**
 * A048215 a(n)=T(n,3), array T given by A048212.
 * @author Sean A. Irvine
 */
public class A048215 extends A004979 {

  {
    setOffset(3);
  }

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
