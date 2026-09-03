package irvine.oeis.a086;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086437 Triangle of number C(3; m,k) of arrangements of k objects of one type and m of another such that no 3-run occurs.
 * @author Sean A. Irvine
 */
public class A086437 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mC = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int m, final int k) {
      if (m < 0) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(0, 2, i -> get(m - 1, k - i))
        .subtract(Integers.SINGLETON.sum(1, 2, i -> get(m - 3, k - i)))
        .add(e(m, k));
    }
  };

  private long e(final int m, final int k) {
    if (m == 0 && 0 <= k && k <= 2) {
      return 1;
    }
    if (m == 3 && 0 <= k && k <= 2) {
      return -1;
    }
    return 0;
  }

  @Override
  public Z next() {
    if (++mM > 2 * (mN + 1)) {
      ++mN;
      mM = 0;
    }
    return mC.get(mN, mM);
  }
}

