package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048888 a(n) = Sum_{m=1..n} T(m,n+1-m), array T as in A048887.
 * @author Sean A. Irvine
 */
public class A048888 extends A048887 {

  /** Construct the sequence. */
  public A048888() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 1; m <= mN; ++m) {
      sum = sum.add(get(mN + 1 - m, m));
    }
    return sum;
  }
}

