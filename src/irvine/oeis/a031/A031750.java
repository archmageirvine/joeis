package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031750 Least term in period of continued fraction for <code>sqrt(n)</code> is 72.
 * @author Sean A. Irvine
 */
public class A031750 extends A031424 {

  private static final Z N = Z.valueOf(72);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
