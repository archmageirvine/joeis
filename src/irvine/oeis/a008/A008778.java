package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008778.
 * @author Sean A. Irvine
 */
public class A008778 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(8).multiply(mN).add(6).multiply(mN.add(1)).divide(6);
  }
}
