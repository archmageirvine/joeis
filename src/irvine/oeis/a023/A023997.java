package irvine.oeis.a023;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023997 Number of block permutations on an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A023997 implements Sequence {

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
      sum = sum.add(f.multiply(Stirling.secondKind(mN, k).square()));
    }
    return sum;
  }
}

