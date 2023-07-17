package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026552;

/**
 * A027273 a(n) = Sum_{k=0..2n-1} T(n,k) * T(n,k+1), with T given by A026552.
 * @author Sean A. Irvine
 */
public class A027273 extends A026552 {

  /** Construct the sequence. */
  public A027273() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
