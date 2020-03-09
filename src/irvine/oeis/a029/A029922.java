package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029922 Convert n from kilometers (km) to miles.
 * @author Sean A. Irvine
 */
public class A029922 implements Sequence {

  private static final Q KM_TO_MILES = new Q(1000000, 1609344);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return KM_TO_MILES.multiply(mN).round();
  }
}
