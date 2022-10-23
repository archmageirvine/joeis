package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029920 Convert n from centimeters (cm) to inches (").
 * @author Sean A. Irvine
 */
public class A029920 extends Sequence0 {

  private static final Q CM_TO_INCHES = new Q(100, 254);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return CM_TO_INCHES.multiply(mN).round();
  }
}
