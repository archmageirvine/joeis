package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026710 T(n,1) + T(n,2) + ... + T(n,n), T given by A026703.
 * @author Sean A. Irvine
 */
public class A026710 extends A026703 {

  /** Construct the sequence. */
  public A026710() {
    super(0);
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
