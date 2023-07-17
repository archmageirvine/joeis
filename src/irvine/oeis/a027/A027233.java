package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026758;

/**
 * A027233 a(n) = Sum_{k=0..n-2} T(n,k) * T(n,k+2), with T given by A026758.
 * @author Sean A. Irvine
 */
public class A027233 extends A026758 {

  /** Construct the sequence. */
  public A027233() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
