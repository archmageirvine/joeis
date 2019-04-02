package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004156 Odd numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004156 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return ZUtils.reverse(mN);
  }
}
