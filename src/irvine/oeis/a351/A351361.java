package irvine.oeis.a351;

import irvine.math.z.Z;

/**
 * A351361 Number of binary necklaces with n beads and at least four consecutive black beads.
 * @author Gregory Morse
 */
public class A351361 extends A351358 {
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
