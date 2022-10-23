package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029924 Convert n from kilograms (kg) to pounds (lbs).
 * @author Sean A. Irvine
 */
public class A029924 extends Sequence0 {

  private static final Q KG_TO_LB = new Q(100000000, 45359237);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return KG_TO_LB.multiply(mN).round();
  }
}
