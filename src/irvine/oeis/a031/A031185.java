package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031185 Numbers having period-7 4-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031185 extends A031182 {

  @Override
  public Z next() {
    while (!Z.SEVEN.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
