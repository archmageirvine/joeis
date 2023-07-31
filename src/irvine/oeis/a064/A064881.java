package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064881 Eisenstein array Ei(1,2).
 * @author Sean A. Irvine
 */
public class A064881 extends Sequence1 {

  private final Z mA10;
  private final Z mA11;
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1) {
        return m == 0 ? mA10 : mA11;
      }
      if ((m & 1) == 0) {
        return get(n - 1, m / 2);
      }
      return get(n - 1, (m - 1) / 2).add(get(n - 1, (m + 1) / 2));
    }
  };

  protected A064881(final long a, final long b) {
    mA10 = Z.valueOf(a);
    mA11 = Z.valueOf(b);
  }

  /** Construct the sequence. */
  public A064881() {
    this(1, 2);
  }

  @Override
  public Z next() {
    if (++mM > 1 << (mN - 1)) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}

