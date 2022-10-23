package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A056963 Base 20 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A056963 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ZUtils.reverse(mN, 20);
  }
}
