package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026120 Triangle T by rows: second differences of Motzkin triangle <code>(A026300), (i &gt;= -1, -1&lt;=j&lt;=i)</code>.
 * @author Sean A. Irvine
 */
public class A026120 extends A026105 {

  private long mN = -2;
  private long mM = 0;

  private Z u(final long n, final long m) {
    if (n == 1 && m == 0) {
      return Z.ONE;
    }
    if (m == -1) {
      return Z.ONE;
    }
    return m(n + 1, m + 1).subtract(m(n, m));

  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = -1;
    }
    return u(mN, mM);
  }
}
