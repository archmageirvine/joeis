package irvine.oeis.a351;

import irvine.math.z.Z;

/**
 * A351360 Number of binary necklaces with n beads and at least three consecutive black beads.
 * @author Gregory Morse
 */
public class A351360 extends A351357 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
