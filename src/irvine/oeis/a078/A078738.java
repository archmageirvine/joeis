package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078738 Generalized Bell numbers B_{3,2}(n).
 * @author Sean A. Irvine
 */
public class A078738 extends A078740 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
