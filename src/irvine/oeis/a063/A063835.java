package irvine.oeis.a063;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;
import irvine.oeis.a047.A047968;

/**
 * A063835 Three times partitioned numbers: the number of ways a number can be partitioned in (not necessarily different) parts and each part again so partitioned a second and a third time.
 * @author Sean A. Irvine
 */
public class A063835 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mA = MemorySequence.cachedSequence(new ConvolutionSequence(new PrependSequence(new A047968(), 0), new A000041()));

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0 || i == 1) {
        return Z.ONE;
      }
      return get(n, i - 1).add(i > n ? Z.ZERO : get(n - i, i).multiply(mA.a(i)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
