package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006222.
 * @author Sean A. Irvine
 */
public class A006222 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(11).add(11).multiply(mN).add(3);
  }
}
