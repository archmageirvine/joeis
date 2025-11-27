package irvine.oeis.a082;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082163 Number of deterministic completely defined initially connected acyclic automata with 2 inputs and n+1 transient unlabeled states including a unique state having all transitions to the absorbing state.
 * @author Sean A. Irvine
 */
public class A082163 extends Sequence1 {

  private int mN = 0;
  private final A082171 mS2 = new A082171();
  private final MemoryFunction1<Z> mC = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      return mS2.mB.get(n, 1).subtract(Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n - 1, k - 1).multiply(mS2.mB.get(n - k, k + 1)).multiply(get(k))));
    }
  };

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : mC.get(mN - 1).divide(Functions.FACTORIAL.z(mN - 2));
  }
}

