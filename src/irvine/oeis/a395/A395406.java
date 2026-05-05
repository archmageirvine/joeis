package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a025.A025487;

/**
 * A395406 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A395406 extends Sequence1 {

  // After Felix Huber

  private final Sequence mA = new A025487();
  private int mT = mA.next().intValueExact();
  private int mO = Functions.BIG_OMEGA.i(mT);
  private int mM = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int m, final int k, final int b) {
      if (k <= 1) {
        return k == 0 ? (m == 1 ? Z.ONE : Z.ZERO) : (m >= b ? Z.ONE : Z.ZERO);
      }
      final int end = Z.valueOf(m).root(k).intValueExact();
      Z sum = Z.ZERO;
      for (final Z dd : Jaguar.factor(m).divisors()) {
        final int d = dd.intValue();
        if (d >= b && d <= end) {
          sum = sum.add(get(m / d, k - 1, d));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mO) {
      mT = mA.next().intValueExact();
      mO = Functions.BIG_OMEGA.i(mT);
      mM = 0;
    }
    return mB.get(mT, mM, 2);
  }
}
