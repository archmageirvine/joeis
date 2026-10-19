package irvine.oeis.a097;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A097749 Triangle T(n,k), n &gt;= 0, 0 &lt;= k &lt;= n, read by rows. Let A(n,k) be the triangle in A097474. Then T(n,k) is defined by the orthogonality relations Sum_{j=i..r} T(r,j)*A(j,i)*2^-floor((j+3)/2) = 0 if i != r, = (2r+1)!/(r!*2^r) if i = r.
 * @author Sean A. Irvine
 */
public class A097749 extends A097474 {

  private int mN = -1;
  private int mK = 0;
  private final MemoryFunctionInt2<Q> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Q compute(final int n, final int k) {
      final int h = (k + 3) / 2;
      if (n == k) {
        return new Q(Functions.FACTORIAL.z(2 * n + 1).divide(Functions.FACTORIAL.z(n)).shiftLeft(h - n), t(k, k));
      }
      Q s = Q.ZERO;
      for (int j = k + 1; j <= n; ++j) {
        s = s.subtract(get(n, j).multiply(t(j, k)).multiply(Q.TWO.pow(h - (j + 3) / 2)));
      }
      s = s.divide(t(k, k));
      return s;
    }
  };

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return mB.get(mN, mK).toZ();
  }
}
