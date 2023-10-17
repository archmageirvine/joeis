package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066400/
 * @author Sean A. Irvine
 */
public class A066447 extends Sequence0 {

  private int mN = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int d) {
      if (n == 0 && d == 0) {
        return Z.ONE;
      }
      if (n <= 0 || d <= 0) {
        return Z.ZERO;
      }
      return get(n - d, d).add(get(n - 2 * d + 1, d - 1)).add(get(n - 3 * d + 1, d - 1));
    }
  };

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, d -> mB.get(mN, d));
  }
}
