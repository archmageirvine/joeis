package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a133.A133687;

/**
 * A000519 Number of equivalence classes of nonzero regular 0-1 matrices of order n.
 * @author Sean A. Irvine
 */
public class A000519 extends A133687 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
