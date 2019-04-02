package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008462 Take sum of squares of digits of previous term; start with 8.
 * @author Sean A. Irvine
 */
public class A008462 extends A008460 {

  @Override
  protected Z start() {
    return Z.EIGHT;
  }
}
