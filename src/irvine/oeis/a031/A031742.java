package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031742 Numbers k such that the least term in the periodic part of the continued fraction for sqrt(k) is 64.
 * @author Sean A. Irvine
 */
public class A031742 extends A031424 {

  private static final Z N = Z.valueOf(64);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
