package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027986 Sum{T(n,k)*T(n,k+2)}, 0&lt;=k&lt;=2n-2, T given by A027960.
 * @author Sean A. Irvine
 */
public class A027986 extends A027960 {

  /** Construct the sequence. */
  public A027986() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < 2 * mN - 1; ++m) {
      sum = sum.add(get(mN, m).multiply(get(mN, m + 2)));
    }
    return sum;
  }
}
