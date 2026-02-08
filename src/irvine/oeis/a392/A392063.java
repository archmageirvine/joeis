package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392063 Number of colored partitions of n into distinct parts such that all parts have distinct colors and the color of a part of size i is in {1..i}.
 * @author Sean A. Irvine
 */
public class A392063 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= (Functions.SQRT.l(8 * mN + 1) - 1) / 2; ++k) {
      final FixedLengthPartition part = new FixedLengthPartition(mN - Binomial.binomial(k, 2).intValueExact(), k);
      int[] p;
      while ((p = part.next()) != null) {
        sum = sum.add(Functions.PRODUCT.z(p));
      }
    }
    return sum;
  }
}
