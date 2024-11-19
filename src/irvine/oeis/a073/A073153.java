package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A073153 Triangle of numbers relating two sequences A073155 and A073156.
 * @author Sean A. Irvine
 */
public class A073153 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final DirectSequence mA = DirectSequence.create(new A073155());
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(0, m, k -> mA.a(k).multiply(mA.a(n - k)));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
