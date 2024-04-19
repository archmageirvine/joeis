package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064315 Triangle of number of permutations by length of shortest ascending run.
 * @author Sean A. Irvine
 */
public class A064315 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
        @Override
        protected Z compute(final int u, final int o, final int t) {
          if (t + o <= k) {
            return Functions.FACTORIAL.z(u + o);
          }
          final Z v = Integers.SINGLETON.sum(1, o, i -> get(u + i - 1, o - i, Math.min(k, t) + 1));
          if (t <= k) {
            return v.add(Functions.FACTORIAL.z(u + o - 1).multiply(u));
          } else {
            return v.add(Integers.SINGLETON.sum(1, u, i -> get(u - i, o + i - 1, 1)));
          }
        }
      };
      return Integers.SINGLETON.sum(1, n, j -> mB.get(j - 1, n - j, 1));
    }
  };

  protected Z t(final int n, final int k) {
    return mA.get(n, k).subtract(mA.get(n, k - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
