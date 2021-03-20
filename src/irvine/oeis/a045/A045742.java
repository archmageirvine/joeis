package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a089.A089434;

/**
 * A045742 Number of interior faces in all noncrossing connected graphs on n nodes on a circle.
 * @author Sean A. Irvine
 */
public class A045742 extends A089434 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(t(mN, k).multiply(k));
    }
    return sum;
  }
}
