package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a006.A006527;

/**
 * A008412.
 * @author Sean A. Irvine
 */
public class A008412 extends A006527 {

  @Override
  public Z next() {
    return Z.ONE.max(super.next().shiftLeft(3));
  }
}
