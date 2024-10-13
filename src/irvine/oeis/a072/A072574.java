package irvine.oeis.a072;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072574 Triangle T(n,k) of number of compositions (ordered partitions) of n into exactly k distinct parts, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A072574 extends Sequence1 {

  private int mN = 1;
  private int mM = 1;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return n == 1 ? Z.ONE : Z.ZERO;
      }
      if (m < 0 || m > n) {
        return Z.ZERO;
      }
      return get(n - m, m).add(get(n - m, m - 1).multiply(m));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
