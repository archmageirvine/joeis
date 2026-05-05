package irvine.oeis.a395;

import irvine.math.MemoryFunctionInt3;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a350.A350174;

/**
 * A395313 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A395313 extends Sequence1 {

  // After Felix Huber

  private final Sequence mA = new A350174();
  private int mT = mA.next().intValueExact();
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int i) {
      if (n == 0 && k == 0) {
        return Z.ONE;
      }
      if (i <= 0) {
        return Z.ZERO;
      }
      return get(n, k, i - 1).add(Predicates.PRIME.is(i) ? get(n - i, k - 1, i - 1) : get(n - i, k, i - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mT) {
      mT = mA.next().intValueExact();
      mM = 0;
      ++mN;
    }
    return mB.get(mN, mM, mN);
  }
}
