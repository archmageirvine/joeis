package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027077 a(n) = Sum_{k=n+1..2*n} T(n,k), T given by A027052.
 * @author Sean A. Irvine
 */
public class A027077 extends A027052 {

  /** Construct the sequence. */
  public A027077() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = mN + 1; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
