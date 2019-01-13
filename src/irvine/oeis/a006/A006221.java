package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006221.
 * @author Sean A. Irvine
 */
public class A006221 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(34).add(51).multiply(mN).add(27).multiply(mN).add(5);
  }
}
