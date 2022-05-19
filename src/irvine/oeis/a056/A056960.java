package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A056960 Base 11 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A056960 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ZUtils.reverse(mN, 11);
  }
}
