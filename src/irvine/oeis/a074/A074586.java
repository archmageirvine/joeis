package irvine.oeis.a074;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074586 Triangle of Moebius polynomial coefficients, read by rows, the n-th row forming the polynomial M(n,x) such that M(n,-1) = mu(n), the Moebius function of n.
 * @author Sean A. Irvine
 */
public class A074586 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      return m == 1 ? Z.ONE : Integers.SINGLETON.sum(1, n - 1, k -> get(k, m - 1).multiply(n / k));
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
