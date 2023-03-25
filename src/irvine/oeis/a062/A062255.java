package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;

/**
 * A062255 4th level triangle related to Eulerian numbers and binomial transforms (A062254 is third level, A062253 is second level, triangle of Eulerian numbers is first level and triangle with Z(0,0)=1 and Z(n,k)=0 otherwise is 0th level).
 * @author Sean A. Irvine
 */
public class A062255 extends A062254 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mD = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, m).multiply(m + 4).add(get(n - 1, m - 1).multiply(n - m)).add(mC.get(n, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mD.get(mN, mM);
  }
}
