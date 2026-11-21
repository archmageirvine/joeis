package irvine.oeis.a341;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A341500 Number of cycles in the 2 X n rook graph.
 * @author Gregory Morse
 */
public class A341500 extends Sequence1 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 3; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Functions.FACTORIAL.z(k - 1)));
    }
    for (int k = 1; k <= mN / 2; ++k) {
      Z paths = Z.ZERO;
      for (int j = 0; j <= mN - 2 * k; ++j) {
        paths = paths.add(Binomial.binomial(mN - 2 * k, j).multiply(Functions.FACTORIAL.z(k + j - 1)));
      }
      sum = sum.add(paths.square().multiply(k).multiply(Binomial.binomial(mN, 2 * k)).multiply(Binomial.binomial(2 * k, k)).divide2());
    }
    return sum;
  }
}
