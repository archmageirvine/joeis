package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031429 Least term in period of continued fraction for <code>sqrt(n)</code> is 5.
 * @author Sean A. Irvine
 */
public class A031429 extends A031424 {

  @Override
  public Z next() {
    while (!Z.FIVE.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
