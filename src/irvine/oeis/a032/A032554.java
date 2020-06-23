package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A032554 Arrange digits of cubes in descending order.
 * @author Sean A. Irvine
 */
public class A032554 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ZUtils.sortDigitsDescending(mN.pow(3));
  }
}
