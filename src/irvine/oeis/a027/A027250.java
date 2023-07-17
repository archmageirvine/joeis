package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026780;

/**
 * A027250 a(n) = Sum_{k=0..n-3} T(n,k) * T(n,k+3), with T given by A026780.
 * @author Sean A. Irvine
 */
public class A027250 extends A026780 {

  /** Construct the sequence. */
  public A027250() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
