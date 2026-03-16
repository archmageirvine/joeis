package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393672 a(n) = number of partitions of n into distinct odd parts, no two of which differ by 2.
 * @author Sean A. Irvine
 */
public class A393672 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n > i * i) {
        return Z.ZERO;
      }
      final Z t = get(n, i - 1);
      return 2 * i - 1 > n ? t : t.add(get(n - (2 * i - 1), i - 2));
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, (mN + 1) / 2);
  }
}
