package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027137 a(n) = Sum_{k=0..2n} (k+1) * A027113(n, k).
 * @author Sean A. Irvine
 */
public class A027137 extends A027113 {

  private long mN = -1;

  /** Construct the sequence. */
  public A027137() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
