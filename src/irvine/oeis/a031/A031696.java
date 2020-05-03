package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031696 Least term in period of continued fraction for <code>sqrt(n)</code> is 18.
 * @author Sean A. Irvine
 */
public class A031696 extends A031424 {

  private static final Z N = Z.valueOf(18);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
