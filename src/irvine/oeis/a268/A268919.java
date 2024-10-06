package irvine.oeis.a268;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A268919 Numerators of the rational number triangle R(n, k) = (n^4 - 30*n^2*k^2 + 60*n*k^3 -30*k^4) / (120*n), n &gt;= 1, k = 1, ..., n. This is a regularized Sum_{j &gt;= 0} (k + n*j)^(-s) for s = -3 defined by analytic continuation of a generalized Hurwitz zeta function.
 * This is a regularized Sum_{j &gt;= 0} (a + m*j)^(-s) for s = -3 defined by analytic continuation of a generalized Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A268919 extends RationalTriangle {

  /** Construct the sequence. */
  public A268919() {
    super(1);
    hasRAM(true);
  }

  @Override
  public Q compute(int m, int a) {
    final Z mz = Z.valueOf(++m);
    final Z az = Z.valueOf(++a);
    return new Q(mz.pow(4).subtract(mz.multiply(30L * m).multiply((long) a * a)).add(az.pow(3).multiply(60L * m)).subtract(az.pow(4).multiply(30)), 120L * m);
  }
}
