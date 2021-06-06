package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004978;

/**
 * A048202 a(n)=T(n,2), array T given by A048201.
 * @author Sean A. Irvine
 */
public class A048202 extends A004978 {

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
