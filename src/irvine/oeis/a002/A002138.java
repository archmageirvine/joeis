package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A002138 6th powers written backwards.
 * @author Sean A. Irvine
 */
public class A002138 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ZUtils.reverse(mN.pow(6));
  }
}
