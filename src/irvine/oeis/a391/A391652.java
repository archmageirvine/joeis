package irvine.oeis.a391;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391652 Number of Fibonacci words of length n.
 * @author Sean A. Irvine
 */
public class A391652 extends Sequence2 {

  // After Alois P. Heinz

  private int mN = 2;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int x, final int y) {
      return n < 3 ? Z.ONE : Integers.SINGLETON.sum(1, x + y, j -> get(n - 1, y, j));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 1, 1);
  }
}
