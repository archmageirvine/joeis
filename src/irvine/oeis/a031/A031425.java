package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031425 Least term in period of continued fraction for sqrt(n) is 1.
 * @author Sean A. Irvine
 */
public class A031425 extends A031424 {

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
