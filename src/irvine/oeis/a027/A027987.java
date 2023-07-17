package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027987 a(n) = Sum{T(n,k)*T(n,k+3)}, 0&lt;=k&lt;=2n-3, T given by A027960.
 * @author Sean A. Irvine
 */
public class A027987 extends A027960 {

  /** Construct the sequence. */
  public A027987() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < 2 * mN - 2; ++m) {
      sum = sum.add(get(mN, m).multiply(get(mN, m + 3)));
    }
    return sum;
  }
}
