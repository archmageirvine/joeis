package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a008.A008292;

/**
 * A062253 2nd level triangle related to Eulerian numbers and binomial transforms (triangle of Eulerian numbers is first level and triangle with Z(0,0)=1 and Z(n,k)=0 otherwise is 0th level).
 * @author Sean A. Irvine
 */
public class A062253 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final A008292 mE = new A008292();

  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, m).multiply(m + 2).add(get(n - 1, m - 1).multiply(n - m)).add(mE.get((long) n, m + 1L));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
