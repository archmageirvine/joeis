package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a002.A002315;

/**
 * A008843 Squares of NSW numbers (A002315): <code>x^2</code> such that <code>x^2 -</code> 2y^2 <code>= -1</code> for some y.
 * @author Sean A. Irvine
 */
public class A008843 extends A002315 {

  @Override
  public Z next() {
    return super.next().square();
  }
}


