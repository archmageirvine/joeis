package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A048645 Integers with one or two 1-bits in their binary expansion.
 * @author Sean A. Irvine
 */
public class A048645 implements Sequence {

  private Z mA = Z.ONE; // one-bit cases
  private Z mB = Z.THREE; // two-bit cases

  @Override
  public Z next() {
    final Z res;
    if (mA.compareTo(mB) < 0) {
      res = mA;
      mA = mA.multiply2();
    } else {
      res = mB;
      mB = ZUtils.swizzle(mB);
    }
    return res;
  }
}
