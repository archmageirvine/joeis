package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031428 Numbers n such that least term in period of continued fraction for sqrt(n) is 4.
 * @author Sean A. Irvine
 */
public class A031428 extends A031424 {

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
