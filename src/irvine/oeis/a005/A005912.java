package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005912 Truncated cube numbers.
 * @author Sean A. Irvine
 */
public class A005912 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(77).add(69).multiply(mN).add(19).multiply(mN).add(3).divide(3);
  }
}
