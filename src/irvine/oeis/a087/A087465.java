package irvine.oeis.a087;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.gf.GfSequence;

/**
 * A087465 Rank array R of 3/2 read by antidiagonals; this array is the dispersion of the complement of the sequence given by r(n) = r(n-1) + 1 + floor(3n/2) for n&gt;=1, with r(0) = 1; that is, A077043(n+1).
 * @author Sean A. Irvine
 */
public class A087465 extends Sequence0 {

  private final GfSequence mA = new A087483();
  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
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
