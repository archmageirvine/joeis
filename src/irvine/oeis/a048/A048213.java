package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004979;

/**
 * A048213 a(n)=T(n,1), array T given by A048212.
 * @author Sean A. Irvine
 */
public class A048213 extends A004979 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t);
  }
}
