package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A061559.
 * @author Sean A. Irvine
 */
public class A061563 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z t = mN;
    do {
      t = t.add(ZUtils.reverse(t));
    } while (!ZUtils.isPalindrome(t, 10));
    return t;
  }
}
