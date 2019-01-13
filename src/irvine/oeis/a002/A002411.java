package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002411.
 * @author Sean A. Irvine
 */
public class A002411 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply(mN.add(1)).divide(2);
  }
}
