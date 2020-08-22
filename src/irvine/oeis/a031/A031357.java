package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031357 Numbers having period-2 6-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031357 extends A031195 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
