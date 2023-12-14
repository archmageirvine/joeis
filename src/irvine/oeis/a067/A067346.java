package irvine.oeis.a067;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000108;
import irvine.oeis.memory.MemorySequence;

/**
 * A067346 Square array read by antidiagonals: T(n,k)=T(n,k-1)*n^2/(n-1)-Catalan(k-1) with a(n,1)=n-1 and a(1,k)=0 where Catalan(k)=C(2k,k)/(k+1)=A000108(k).
 * @author Sean A. Irvine
 */
public class A067346 extends Sequence1 {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A000108());
  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.valueOf(n - 1);
      }
      if (n == 1) {
        return Z.ZERO;
      }
      return get(n, m - 1).multiply((long) n * n).divide(n - 1).subtract(mC.a(m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM + 1, mN - mM);
  }
}

