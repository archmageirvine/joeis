package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008461 Take sum of squares of digits of previous term.
 * @author Sean A. Irvine
 */
public class A008461 extends A008460 {

  @Override
  protected Z start() {
    return Z.SEVEN;
  }
}
