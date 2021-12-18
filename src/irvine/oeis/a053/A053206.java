package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A014410 Elements in Pascal's triangle (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A053206 extends A053203 {

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
