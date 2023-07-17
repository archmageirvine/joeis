package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026584;

/**
 * A027286 a(n) = Sum_{k=0..2n} (k+1) * A026584(n, k).
 * @author Sean A. Irvine
 */
public class A027286 extends A026584 {

  /** Construct the sequence. */
  public A027286() {
    super(0);
  }

  private long mN = -1;

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
