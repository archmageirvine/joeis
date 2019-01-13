package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a001.A001653;

/**
 * A008844.
 * @author Sean A. Irvine
 */
public class A008844 extends A001653 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
