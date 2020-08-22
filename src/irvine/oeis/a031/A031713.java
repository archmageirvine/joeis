package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031713 Least term in period of continued fraction for sqrt(n) is 35.
 * @author Sean A. Irvine
 */
public class A031713 extends A031424 {

  private static final Z N = Z.valueOf(35);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
