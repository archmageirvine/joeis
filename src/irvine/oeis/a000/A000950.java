package irvine.oeis.a000;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000950 Number of forests with n nodes and height at most 3.
 * @author Sean A. Irvine
 */
public class A000950 extends Sequence0 {

  private int mN = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int h) {
      if (Math.min(n, h) == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n, j -> Binomial.binomial(n - 1, j - 1).multiply(j).multiply(get(j - 1, h - 1)).multiply(get(n - j, h)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 3);
  }
}
