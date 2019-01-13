package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005900.
 * @author Sean A. Irvine
 */
public class A005900 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).multiply2().add(mN).divide(3);
  }
}
