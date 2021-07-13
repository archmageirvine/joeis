package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031428 Numbers k such that the least term in the periodic part of the continued fraction for sqrt(k) is 4.
 * @author Sean A. Irvine
 */
public class A031428 extends A031424 {

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
