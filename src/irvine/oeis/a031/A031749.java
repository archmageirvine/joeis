package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031749 Numbers n such that the least term in the period of the continued fraction for <code>sqrt(n)</code> is 71.
 * @author Sean A. Irvine
 */
public class A031749 extends A031424 {

  private static final Z N = Z.valueOf(71);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
