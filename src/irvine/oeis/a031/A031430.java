package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031430 Least term in period of continued fraction for <code>sqrt(n)</code> is 6.
 * @author Sean A. Irvine
 */
public class A031430 extends A031424 {

  @Override
  public Z next() {
    while (!Z.SIX.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
