package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005893.
 * @author Sean A. Irvine
 */
public class A005893 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply2().add(Z.ZERO.equals(mN) ? 1 : 2);
  }
}
