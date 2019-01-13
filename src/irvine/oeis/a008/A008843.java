package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a002.A002315;

/**
 * A008843.
 * @author Sean A. Irvine
 */
public class A008843 extends A002315 {

  @Override
  public Z next() {
    return super.next().square();
  }
}


