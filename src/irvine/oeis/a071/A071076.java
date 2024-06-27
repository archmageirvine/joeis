package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071076 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int u, final int o, final int t) {
      if (u + o == 0) {
        return Z.ONE;
      }
      Z sum = Integers.SINGLETON.sum(1, u, j -> get(u - j, o + j - 1, 0));
      for (int j = 1; j <= o; ++j) {
        if (t != 1 || o <= j) {
          sum = sum.add(get(u + j - 1, o - j, t + 1));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0, 0);
  }
}
