package irvine.oeis.a393;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393206 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A393206 extends Sequence1 {

  // After Felix Huber

  private static boolean d(final int i) {
    return Functions.SIGMA1.l(i) > 2L * i;
  }

  private int mN = 0;
  private final MemoryFunction1<Integer> mC = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int i) {
      if (i == 0) {
        return 0;
      }
      return get(i - 1) + (d(i) ? i : 0);
    }
  };
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i == 0 || mC.get(i) < n) {
        return Z.ZERO;
      }
      return get(n, i - 1).add(i <= n && d(i) ? get(n - i, i - 1) : Z.ZERO);
    }
  };
  private final MemoryFunctionInt3<Integer> mS = new MemoryFunctionInt3<>() {
    @Override
    protected Integer compute(final int i, final int j, final int n) {
      if (j >= n) {
        return i;
      }
      return get(i + 1, d(i + 1) ? j + 1 : j, n);
    }
  };
  private final MemoryFunction1<Z[]> mT = new MemoryFunction1<>() {
    @Override
    protected Z[] compute(final int n) {
      final Z m;
      final int k;
      if (n <= 1) {
        m = Z.valueOf(12);
        k = 1;
      } else {
        m = mT.get(n - 1)[0];
        k = n - 1;
      }
      final int i = mS.get(m.intValueExact(), k, n);
      return new Z[] {Z.valueOf(i), mB.get(i, i)};
    }
  };

  protected Z select(final Z[] n) {
    return n[1];
  }

  @Override
  public Z next() {
    return select(mT.get(++mN));
  }
}
