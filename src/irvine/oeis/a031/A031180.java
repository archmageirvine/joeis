package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031180 Numbers having period-2 3-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031180 extends A031178 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
