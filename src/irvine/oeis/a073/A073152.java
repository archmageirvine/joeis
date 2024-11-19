package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a052.A052709;

/**
 * A073152 Triangle of numbers relating two simple context-free grammars (A052709 and A052705).
 * @author Sean A. Irvine
 */
public class A073152 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final DirectSequence mA = DirectSequence.create(new A052709());
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (m == 0) {
        return mA.a(n + 1);
      }
      return Integers.SINGLETON.sum(0, m, k -> mA.a(k + 1).multiply(get(n - k, 0)));
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
