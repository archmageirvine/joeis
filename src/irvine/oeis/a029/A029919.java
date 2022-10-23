package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029919 Convert n from inches (") to centimeters (cm).
 * @author Sean A. Irvine
 */
public class A029919 extends Sequence0 {

  private static final Q INCHES_TO_CM = new Q(254, 100);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return INCHES_TO_CM.multiply(mN).round();
  }
}
