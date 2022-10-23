package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047970 Antidiagonal sums of nexus numbers (A047969).
 * @author Sean A. Irvine
 */
public class A047970 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k + 1).pow(mN - k).multiply(k));
    }
    return sum;
  }
}
