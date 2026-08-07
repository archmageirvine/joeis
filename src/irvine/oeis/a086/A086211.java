package irvine.oeis.a086;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086211 Triangle related to Bell numbers; T(n,k) read by rows, n&gt;=0, 0&lt;=k&lt;=n: T(n,k) = k*T(n-1,k) + Sum(0&lt;=j, T(n-1,k-1+j)); T(0,0)=1, T(0,k)=0 if k&gt;0.
 * @author Sean A. Irvine
 */
public class A086211 extends Sequence0 {

  private int mN = 1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n <= 2) {
        return k == 1 ? Z.ONE : Z.ZERO;
      }
      if (k < 1 || k > n) {
        return Z.ZERO;
      }
      return get(n - 1, k - 1).add(get(n - 1, k).multiply(k - 1))
        .add(Integers.SINGLETON.sum(k, n - 2, j -> get(n - 1, j)));
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
