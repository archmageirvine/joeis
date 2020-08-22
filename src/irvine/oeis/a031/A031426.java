package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031426 Least term in period of continued fraction for sqrt(n) is 2.
 * @author Sean A. Irvine
 */
public class A031426 extends A031424 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
