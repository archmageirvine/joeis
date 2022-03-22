package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055451 Row sums of array in A055450.
 * @author Sean A. Irvine
 */
public class A055451 extends A055450 {

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
