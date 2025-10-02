package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024493;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080850 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final Sequence mA = new A024493();
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return mA.next();
      }
      if (m == n) {
        return Z.ONE;
      }
      if (m > n) {
        return Z.ZERO;
      }
      return get(n - 1, m - 1).add(get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}

