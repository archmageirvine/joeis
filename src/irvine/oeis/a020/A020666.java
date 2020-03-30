package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A020666 <code>a(n)^n</code> is the least n-th power containing every digit.
 * @author Sean A. Irvine
 */
public class A020666 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(1023456789);
    }
    Z m = Z.TWO;
    while (ZUtils.syn(m.pow(mN)) != 0b1111111111) {
      m = m.add(1);
    }
    return m;
  }
}
