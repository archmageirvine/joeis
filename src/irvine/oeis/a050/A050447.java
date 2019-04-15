package irvine.oeis.a050;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050447 Table <code>T(n</code>,m) giving total degree of n-th-order elementary symmetric polynomials in m variables, <code>-1 &lt;= n, 1 &lt;=</code> m, transposed and read by upward antidiagonals.
 * @author Sean A. Irvine
 */
public class A050447 extends MemoryFunction2<Long, Z> implements Sequence {

  // Using column labels of Kreweras
  @Override
  protected Z compute(final Long n, final Long r) {
    if (r < 2) {
      return Z.ZERO;
    }
    if (n == 0 || r == 2) {
      return Z.ONE;
    }
    Z sum = get(n, r - 1);
    for (long k = 0; k <= (n - 1) / 2; ++k) {
      sum = sum.add(get(2 * k, r - 1).multiply(get(n - 1 - 2 * k, r)));
    }
    return sum;
  }

  private long mR = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN + 1 >= mR) {
      ++mR;
      mN = 0;
    }
    return get(mN, mR - mN);
  }
}

