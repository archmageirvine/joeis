package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060350 The sum over all subsets S of [n] of the squares of the number of permutations with descent set = S.
 * @author Sean A. Irvine
 */
public class A060350 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int u, final int o, final int h) {
      if (u + o == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= u; ++j) {
        for (int i = 1; i <= u + o - h; ++i) {
          sum = sum.add(get(u - j, o + j - 1, h + i - 1));
        }
      }
      for (int j = 1; j <= o; ++j) {
        for (int i = 1; i <= h; ++i) {
          sum = sum.add(get(u + j - 1, o - j, h - i));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(0, ++mN, mN);
  }
}
