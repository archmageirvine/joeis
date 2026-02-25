package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007425;

/**
 * A393519 allocated for Marko Riedel.
 * @author Sean A. Irvine
 */
public class A393519 extends Sequence0 {

  private final DirectSequence mTau3 = new A007425();
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Q> mRho = new MemoryFunctionInt2<>() {
    @Override
    protected Q compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Q.ONE : Q.ZERO;
      }
      return Rationals.SINGLETON.sum(0, n - 1, q -> get(n - 1 - q, m - 1).multiply(mTau3.a(q + 1))).divide(n);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mRho.get(mN, mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
