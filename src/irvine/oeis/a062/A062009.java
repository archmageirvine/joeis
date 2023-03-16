package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062009 extends A000040 {

  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(super.next()).sqrt());
    return mSum.floor();
  }
}
