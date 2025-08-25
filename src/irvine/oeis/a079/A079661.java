package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079661 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1 || m == n) {
        return Z.valueOf(n);
      }
      return new Z(get(n - 1, m - 1).toString(2) + get(n - 1, m).toString(2), 2);
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

