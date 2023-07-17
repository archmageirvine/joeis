package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026725;

/**
 * A027209 a(n) = Sum_{k=0..n-2} T(n,k) * T(n,k+2), with T given by A026725.
 * @author Sean A. Irvine
 */
public class A027209 extends A026725 {

  /** Construct the sequence. */
  public A027209() {
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
