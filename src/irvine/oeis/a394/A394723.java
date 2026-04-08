package irvine.oeis.a394;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394723 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A394723 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int s, final int m) {
      if (s == 0) {
        return Z.ONE;
      }
      if (m == 0) {
        return Z.ZERO;
      }
      return get(s, m - 1).add(s >= m ? get(s - m, m - 1) : Z.ZERO);
    }
  };

  @Override
  public Z next() {
    ++mN;
    final int m = 2 * mN - (mN & 1);
    return mB.get(m * (m - 1) / 4, m);
  }
}
