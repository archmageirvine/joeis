package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025578 a(n) = Sum{T(n,k-1), k = 1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A025578 extends A025564 {

  /** Construct the sequence. */
  public A025578() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
