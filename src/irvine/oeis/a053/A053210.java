package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a051.A051599;

/**
 * A014410 Elements in Pascal's triangle (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A053210 extends A051599 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
