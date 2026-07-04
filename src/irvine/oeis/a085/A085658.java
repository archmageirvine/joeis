package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a083.A083029;

/**
 * A085658 Number of n X n symmetric positive semi-definite matrices with 2's on the main diagonal and 1's and 0's elsewhere.
 * @author Sean A. Irvine
 */
public class A085658 extends A083029 {

  private int mN;

  @Override
  public Z next() {
    ++mN;
    Z count = Z.ZERO;
    for (int m = 0; m <= mN * (mN - 1) / 2; ++m) {
      count = count.add(super.next());
    }
    return count;
  }
}
