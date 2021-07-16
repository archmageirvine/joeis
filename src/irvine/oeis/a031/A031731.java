package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031731 Numbers k such that the least term in the periodic part of the continued fraction for sqrt(k) is 53.
 * @author Sean A. Irvine
 */
public class A031731 extends A031424 {

  private static final Z N = Z.valueOf(53);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
