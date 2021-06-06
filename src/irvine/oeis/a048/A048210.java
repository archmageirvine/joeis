package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004978;

/**
 * A048210 T(n,1)+T(n,n), array T given by A048201.
 * @author Sean A. Irvine
 */
public class A048210 extends A004978 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.multiply2().subtract(t).subtract(1);
  }
}
