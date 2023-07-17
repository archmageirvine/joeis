package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a059.A059882;

/**
 * A025049 Number of down/up (initially descending) compositions of n.
 * @author Sean A. Irvine
 */
public class A025049 extends A059882 {

  /** Construct the sequence. */
  public A025049() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(mS.get(mN, k));
    }
    return sum;
  }
}
