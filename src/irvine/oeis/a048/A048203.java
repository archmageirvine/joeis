package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004978;

/**
 * A048203 a(n)=T(n,3), array T given by A048201.
 * @author Sean A. Irvine
 */
public class A048203 extends A004978 {

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
