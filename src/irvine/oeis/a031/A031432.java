package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031432 Least term in period of continued fraction for sqrt(n) is 8.
 * @author Sean A. Irvine
 */
public class A031432 extends A031424 {

  @Override
  public Z next() {
    while (!Z.EIGHT.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
