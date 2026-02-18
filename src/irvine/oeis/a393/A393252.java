package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a083.A083207;

/**
 * A393252 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A393252 extends Sequence1 {

  private int mN = 0;
  private final DirectSequence mZ = DirectSequence.create(new A083207());
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      return get(n, i - 1).add(mZ.a(i).compareTo(n) > 0 ? Z.ZERO : get(n - mZ.a(i).intValueExact(), i - 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(mZ.a(++mN).intValueExact(), mN);
  }
}
