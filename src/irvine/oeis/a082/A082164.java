package irvine.oeis.a082;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082164 Deterministic completely defined initially connected acyclic automata with 3 inputs and n+1 transient unlabeled states including a unique state having all transitions to the absorbing state.
 * @author Sean A. Irvine
 */
public class A082164 extends Sequence1 {

  private int mN = -1;
  private final A082172 mS3 = new A082172();
  private final MemoryFunction1<Z> mC = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      return mS3.mB.get(n, 1).subtract(Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n - 1, k - 1).multiply(mS3.mB.get(n - k, k + 1)).multiply(get(k))));
    }
  };

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : mC.get(mN).divide(Functions.FACTORIAL.z(mN - 1));
  }
}

