package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079128 Number of degree-n permutations with (mutually) relatively prime cycle lengths.
 * @author Sean A. Irvine
 */
public class A079128 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int g) {
      if (n == 0) {
        return g == 1 ? Z.ONE : Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n, j -> Functions.FACTORIAL.z(j - 1).multiply(get(n - j, Functions.GCD.i(g, j)).multiply(Binomial.binomial(n - 1, j - 1))));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}

