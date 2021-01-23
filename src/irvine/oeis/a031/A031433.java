package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031433 Least term in period of continued fraction for sqrt(n) is 9.
 * @author Sean A. Irvine
 */
public class A031433 extends A031424 {

  @Override
  public Z next() {
    while (!Z.NINE.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
