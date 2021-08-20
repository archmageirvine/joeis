package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050871 Row sums of even numbered rows of array T in A050870 (periodic binary words).
 * @author Sean A. Irvine
 */
public class A050871 extends A050870 {

  private long mN = -2;

  @Override
  public Z next() {
    // skip over odd length row
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      super.next();
    }
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
