package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006529.
 * @author Sean A. Irvine
 */
public class A006529 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(25).subtract(120).multiply(mN).add(209).multiply(mN).subtract(108).multiply(mN).divide(6);
  }
}
