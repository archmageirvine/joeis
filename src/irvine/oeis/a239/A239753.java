package irvine.oeis.a239;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001372;

/**
 * A239753 Number of pairs of functions (f,g) on a set of n elements into itself satisfying f(x) = g(f(g(x))).
 * @author Gregory Morse
 */
public class A239753 extends Sequence0 {
  private final DirectSequence mTrees = DirectSequence.create(new A001372());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, k - 1).multiply(Functions.FACTORIAL.z(k)).multiply(Z.valueOf(mN).pow(mN - k)).multiply(mTrees.a(k)));
    }
    return sum;
  }
}
