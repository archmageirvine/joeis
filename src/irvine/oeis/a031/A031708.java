package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031708 Least term in period of continued fraction for <code>sqrt(n)</code> is 30.
 * @author Sean A. Irvine
 */
public class A031708 extends A031424 {

  private static final Z N = Z.valueOf(30);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
