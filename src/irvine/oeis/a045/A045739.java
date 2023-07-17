package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a094.A094040;

/**
 * A045739 Number of edges in all noncrossing forests on n nodes on a circle.
 * @author Sean A. Irvine
 */
public class A045739 extends A094040 {

  /** Construct the sequence. */
  public A045739() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(t(mN, k).multiply(k));
    }
    return sum;
  }
}
