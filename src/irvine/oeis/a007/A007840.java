package irvine.oeis.a007;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007840 Number of factorizations of permutations of n letters into ordered cycles.
 * @author Sean A. Irvine
 */
public class A007840 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z f = Z.ONE;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      f = f.multiply(k);
      sum = sum.add(f.multiply(Stirling.firstKind(mN, k).abs()));
    }
    return sum;
  }
}
