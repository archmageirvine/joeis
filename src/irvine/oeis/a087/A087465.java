package irvine.oeis.a087;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.gf.GfSequence;

/**
 * A087450.
 * @author Sean A. Irvine
 */
public class A087465 extends Sequence0 {

  private final GfSequence mA = new A087483();
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int i, final int j) {
      if (i == 0) {
        return mA.a(j);
      }
      if (j == 0) {
        return get(i - 1, 0).add(1 + 3L * i / 2);
      }
      return get(i, 0).add(get(0, j)).add((long) i * j - 1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}
