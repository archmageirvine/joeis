package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005894 Centered tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A005894 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(1).multiply(mN).add(3).multiply(mN.multiply2().add(1)).divide(3);
  }
}
