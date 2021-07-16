package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031690 Numbers k such that the least term in the periodic part of the continued fraction for sqrt(k) is 12.
 * @author Sean A. Irvine
 */
public class A031690 extends A031424 {

  private static final Z N = Z.valueOf(12);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
