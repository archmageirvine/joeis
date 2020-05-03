package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031431 Least term in period of continued fraction for <code>sqrt(n)</code> is 7.
 * @author Sean A. Irvine
 */
public class A031431 extends A031424 {

  @Override
  public Z next() {
    while (!Z.SEVEN.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
