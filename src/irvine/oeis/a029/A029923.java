package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029923 Convert n from pounds (lbs) to kilograms (kg).
 * @author Sean A. Irvine
 */
public class A029923 implements Sequence {

  private static final Q LB_TO_KG = new Q(45359237, 100000000);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return LB_TO_KG.multiply(mN).round();
  }
}
