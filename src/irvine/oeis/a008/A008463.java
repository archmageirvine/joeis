package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008463 Take sum of squares of digits of previous term; start with 9.
 * @author Sean A. Irvine
 */
public class A008463 extends A008460 {

  @Override
  protected Z start() {
    return Z.NINE;
  }
}
