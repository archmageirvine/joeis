package irvine.oeis.a173;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A173004 Antidiagonal triangle sequence based on recursion: f(n,a)=a*f(n-1,a)+n*f(n-2,a).
 * @author Sean A. Irvine
 */
public class A173004 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return Z.ZERO;
      }
      if (k == 1) {
        return Z.ONE;
      }
      return get(n, k - 1).multiply(n).add(get(n, k - 2).multiply(k));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM + 1, mM);
  }
}
