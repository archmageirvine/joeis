package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a002.A002315;

/**
 * A008843 Squares of NSW numbers <code>(A002315): x^2</code> such that <code>x^2 - 2y^2 = -1</code> for some <code>y</code>.
 * @author Sean A. Irvine
 */
public class A008843 extends A002315 {

  @Override
  public Z next() {
    return super.next().square();
  }
}


