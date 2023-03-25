package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;

/**
 * A062254 3rd level triangle related to Eulerian numbers and binomial transforms (A062253 is second level, triangle of Eulerian numbers is first level and triangle with Z(0,0)=1 and Z(n,k)=0 otherwise is 0th level).
 * @author Sean A. Irvine
 */
public class A062254 extends A062253 {

  private int mN = -1;
  private int mM = 0;

  protected final MemoryFunctionInt2<Z> mC = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, m).multiply(m + 3).add(get(n - 1, m - 1).multiply(n - m)).add(mB.get(n, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mC.get(mN, mM);
  }
}
