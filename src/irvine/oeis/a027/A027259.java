package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a025.A025177;

/**
 * A027259 a(n) = Sum_{k=0..2n-2} T(n,k) * T(n,k+2), with T given by A025177.
 * @author Sean A. Irvine
 */
public class A027259 extends A025177 {

  /** Construct the sequence. */
  public A027259() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
