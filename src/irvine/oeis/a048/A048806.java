package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048806 Column 0 of A048805.
 * @author Sean A. Irvine
 */
public class A048806 extends A048805 {

  @Override
  public Z next() {
    step();
    return mAInverse.get(mN - 1, 0).toZ();
  }
}
