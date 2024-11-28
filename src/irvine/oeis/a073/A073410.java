package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073408.
 * @author Sean A. Irvine
 */
public class A073410 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int c) {
      if (2 * Math.abs(n) > i * (i + 1)) {
        return Z.ZERO;
      }
      if (i == 0) {
        return Math.abs(c) < 2 ? Z.ONE : Z.ZERO;
      }
      return get(n + i, i - 1, c + 1).add(get(n - i, i - 1, c - 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(0, ++mN, 0)
      .multiply(Functions.FACTORIAL.z(mN / 2))
      .multiply(Functions.FACTORIAL.z((mN + 1) / 2))
      .shiftRight(mN & 1);
  }
}
