package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029921 Convert n from miles to kilometers (km).
 * @author Sean A. Irvine
 */
public class A029921 implements Sequence {

  private static final Q MILES_TO_KM = new Q(1609344, 1000000);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return MILES_TO_KM.multiply(mN).round();
  }
}
