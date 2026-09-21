package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393538 allocated for Naveed Javeed.
 * @author Sean A. Irvine
 */
public class A393538 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt2<Q> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Q compute(final int n, final int m) {
      if (m == 0 || m == n) {
        return Q.ONE;
      }
      return get(n - 1, m -1).reciprocal().add(get(n - 1, m).reciprocal());
    }
  };

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(mB.get(mN, mM));
  }
}

