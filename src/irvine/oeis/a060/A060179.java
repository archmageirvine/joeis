package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunctionInt2;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060179 Sum of distinct orders of degree-n permutations.
 * @author Sean A. Irvine
 */
public class A060179 extends Sequence0 {

  // After Alois P. Heinz

  private final Fast mFast = new Fast();
  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {

    @Override
    protected Z compute(final int n, final int i) {
      if (i * n == 0) {
        return Z.ONE;
      }
      final int p = i == 0 ? 0 : Functions.PRIME.i(i);
      final int logp = CR.valueOf(n).log().divide(CR.valueOf(p).log()).floor().intValueExact();
      Z sum = get(n, i - 1);
      int pj = p;
      for (int j = 1; j <= logp; ++j, pj *= p) {
        sum = sum.add(get(n - pj, i - 1).multiply(pj));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (mFast.isPrime(++mN)) {
      ++mM;
    }
    return mB.get(mN, mM);
  }
}
