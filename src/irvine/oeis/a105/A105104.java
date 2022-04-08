package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a102.A102370;

/**
 * A105104 Write A102370 in binary (A103542), read backwards, omit leading zeros, convert to base 10.
 * @author Georg Fischer
 */
public class A105104 extends A102370 {

  @Override
  public Z next() {
    return new Z(ZUtils.reverse(super.next(), 2).toString(2), 2);
  }
}
