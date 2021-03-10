package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.a030.A030524;

/**
 * A043549.
 * @author Sean A. Irvine
 */
public class A043553 extends A030524 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}

