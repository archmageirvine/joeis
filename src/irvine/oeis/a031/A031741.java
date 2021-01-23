package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031741 Least term in period of continued fraction for sqrt(n) is 63.
 * @author Sean A. Irvine
 */
public class A031741 extends A031424 {

  private static final Z N = Z.valueOf(63);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
