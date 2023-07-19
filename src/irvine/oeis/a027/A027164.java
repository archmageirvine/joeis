package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027164 a(n) = T(n,0) + T(n,1) + ... + T(n,n), T given by A027157.
 * @author Sean A. Irvine
 */
public class A027164 extends A027157 {

  /** Construct the sequence. */
  public A027164() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
