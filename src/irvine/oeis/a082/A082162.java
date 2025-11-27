package irvine.oeis.a082;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082162 Number of deterministic completely defined initially connected acyclic automata with 3 inputs and n transient unlabeled states (and a unique absorbing state).
 * @author Sean A. Irvine
 */
public class A082162 extends Sequence1 {

  private int mN = 0;
  private final A082170 mT3 = new A082170();
  private final MemoryFunction1<Z> mC = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return mT3.t(n, 1).subtract(Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n - 1, k - 1).multiply(mT3.t(n - k, k + 1)).multiply(get(k))));
    }
  };

  @Override
  public Z next() {
    return mC.get(++mN).divide(Functions.FACTORIAL.z(mN - 1));
  }
}

