package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026596 Row sums of A026584.
 * @author Sean A. Irvine
 */
public class A026596 extends A026584 {

  /** Construct the sequence. */
  public A026596() {
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
