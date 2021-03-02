package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a051.A051703;

/**
 * A039952 Maximum cardinality of finite D0L sequence over an alphabet with n symbols.
 * @author Sean A. Irvine
 */
public class A039952 extends A051703 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(1).max(super.next());
    return mA;
  }
}
