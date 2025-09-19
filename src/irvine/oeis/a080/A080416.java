package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080416 Stirling-like number triangle defined by paired decomposition of C(n+3,3) = A000292.
 * @author Sean A. Irvine
 */
public class A080416 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int b, final int n, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      if (k == 0) {
        return Z.ZERO;
      }
      return get(b + 1, n - 1, k - 1).add(get(b, n - 1, k).multiply(b).multiply(k));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(0, mN + 2, mM + 2);
  }
}
