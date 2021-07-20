package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031760 Numbers k such that the least term in the periodic part of the continued fraction for sqrt(k) is 82.
 * @author Sean A. Irvine
 */
public class A031760 extends A031424 {

  private static final Z N = Z.valueOf(82);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
