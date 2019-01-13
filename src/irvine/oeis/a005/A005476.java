package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005476.
 * @author Sean A. Irvine
 */
public class A005476 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(5).subtract(1).multiply(mN).divide2();
  }
}
