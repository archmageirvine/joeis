package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005904.
 * @author Sean A. Irvine
 */
public class A005904 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(5).add(5).multiply(mN).add(1).multiply(mN.multiply2().add(1));
  }
}
