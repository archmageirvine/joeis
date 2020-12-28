package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037897 (Greatest base 3 digit of n)-(least base 3 digit of n).
 * @author Sean A. Irvine
 */
public class A037897 implements Sequence {

  private Z mN = Z.ZERO;

  protected int base() {
    return 3;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(ZUtils.sortDigitsAscending(mN, base()).mod(base()) - ZUtils.sortDigitsDescending(mN, base()).mod(base()));
  }
}
