package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007954.
 * @author Sean A. Irvine
 */
public class A007954 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ZUtils.digitProduct(mN);
  }
}
