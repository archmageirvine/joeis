package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031777 Numbers n such that least term in period of continued fraction for <code>sqrt(n)</code> is 99.
 * @author Sean A. Irvine
 */
public class A031777 extends A031424 {

  private static final Z N = Z.valueOf(99);

  @Override
  public Z next() {
    while (!N.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
