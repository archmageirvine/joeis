package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031207 Numbers having period-27 7-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031207 extends A031200 {

  private static final Z Z27 = Z.valueOf(27);

  @Override
  public Z next() {
    while (!Z27.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
