package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062697.
 * @author Sean A. Irvine
 */
public class A062868 extends A062866 {

  @Override
  public Z next() {
    step();
    return mRow.get(0);
  }
}
