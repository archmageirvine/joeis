package irvine.oeis.a067;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000108;
import irvine.oeis.memory.MemorySequence;

/**
 * A067347 Square array read by antidiagonals: T(n,k)=(T(n,k-1)*n^2-Catalan(k-1)*n)/(n-1) with a(n,0)=1 and a(1,k)=Catalan(k) where Catalan(k)=C(2k,k)/(k+1)=A000108(k).
 * @author Sean A. Irvine
 */
public class A067347 extends Sequence0 {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A000108());
  private int mN = -1;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m <= 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return mC.a(m);
      }
      return get(n, m - 1).multiply((long) n * n).subtract(mC.a(m - 1).multiply(n)).divide(n - 1);
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

