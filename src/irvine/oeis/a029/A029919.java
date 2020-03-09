package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029919 Convert n from inches <code>(")</code> to centimeters (cm).
 * @author Sean A. Irvine
 */
public class A029919 implements Sequence {

  private static final Q INCHES_TO_CM = new Q(254, 100);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return INCHES_TO_CM.multiply(mN).round();
  }
}
