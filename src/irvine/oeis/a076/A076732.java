package irvine.oeis.a076;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000240;

/**
 * A076732 Table T(n,k) giving number of ways of obtaining exactly one correct answer on an (n,k)-matching problem (1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A076732 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final A000240 mA000240 = new A000240();
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.ONE;
      }
      if (m == n) {
        return mA000240.a(n);
      }
      return get(n - 1, m - 1).multiply(m).add(get(n - 1, m));
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
