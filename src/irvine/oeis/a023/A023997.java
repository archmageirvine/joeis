package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023997 Number of block permutations on an n-set.
 * @author Sean A. Irvine
 */
public class A023997 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      f = f.multiply(k);
      sum = sum.add(f.multiply(Functions.STIRLING2.z(mN, k).square()));
    }
    return sum;
  }
}

