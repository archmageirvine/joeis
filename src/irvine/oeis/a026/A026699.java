package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026699 T(n,0) + T(n,1) + ... + T(n,n), T given by A026692.
 * @author Sean A. Irvine
 */
public class A026699 extends A026692 {

  /** Construct the sequence. */
  public A026699() {
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
