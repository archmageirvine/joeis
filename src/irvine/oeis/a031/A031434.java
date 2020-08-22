package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031434 Least term in period of continued fraction for sqrt(n) is 10.
 * @author Sean A. Irvine
 */
public class A031434 extends A031424 {

  @Override
  public Z next() {
    while (!Z.TEN.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
