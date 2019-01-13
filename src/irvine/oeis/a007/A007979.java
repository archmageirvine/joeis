package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007979.
 * @author Sean A. Irvine
 */
public class A007979 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(3).multiply(mN).add(24).multiply(mN).add(18).divide(18);
  }
}
