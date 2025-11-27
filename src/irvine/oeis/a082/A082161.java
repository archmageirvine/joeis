package irvine.oeis.a082;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082161 Number of deterministic completely defined initially connected acyclic automata with 2 inputs and n transient unlabeled states (and a unique absorbing state).
 * @author Sean A. Irvine
 */
public class A082161 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < m) {
        return Z.ZERO;
      }
      if (m == 0) {
        return Z.ONE;
      }
      return get(n - 1, m).multiply(m + 1).add(get(n, m - 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}

