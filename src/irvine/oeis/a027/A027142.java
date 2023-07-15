package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027142 a(n) = Sum_{k=0..2n-2} T(n,k) * T(n,k+2), with T given by A027113.
 * @author Sean A. Irvine
 */
public class A027142 extends A027113 {

  private long mN = 1;

  /** Construct the sequence. */
  public A027142() {
    super(2);
  }

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
