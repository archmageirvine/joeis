package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a001.A001653;

/**
 * A008844 Squares of sequence A001653: y^2 such that x^2 - 2*y^2 = -1 for some x.
 * @author Sean A. Irvine
 */
public class A008844 extends A001653 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
