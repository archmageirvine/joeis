package irvine.oeis.a123;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a339.A339063;

/**
 * A123551 Triangle read by rows: T(n,k) gives number of unlabeled graphs without endpoints on n nodes and k edges, (n &gt;= 0, 0 &lt;= k &lt;= n(n-1)/2).
 * @author Gregory Morse
 */
public class A123551 extends A339063 {
  // After Andrew Howroyd.
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mRow = RING.zero();

  /**
   * Count graphs without endpoints by number of edges.
   * @param n number of vertices
   * @param degreeLimit maximum number of edges
   * @return the counting polynomial
   */
  public Polynomial<Z> endpointFree(final int n, final int degreeLimit) {
    Polynomial<Z> sum = RING.zero();
    for (int k = Math.max(0, n - degreeLimit); k <= n; ++k) {
      final int d = n - k;
      final IntegerPartition part = new IntegerPartition(k);
      Polynomial<Z> fixed = RING.zero();
      int[] p;
      while ((p = part.next()) != null) {
        Polynomial<Z> mark = RING.one();
        for (final int size : p) {
          if (size <= d) {
            mark = RING.multiply(mark, RING.oneMinusXToTheN(Z.ONE, size), d);
          }
        }
        final Z weight = mark.coeff(d);
        if (!weight.isZero()) {
          fixed = RING.add(fixed, RING.multiply(edgesPoly(p, degreeLimit - d), IntegerPartition.permCount(p).multiply(weight)));
        }
      }
      sum = RING.add(sum, RING.divide(fixed, Functions.FACTORIAL.z(k)).shift(d));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2 || mN < 0) {
      ++mN;
      mM = 0;
      mRow = endpointFree(mN, mN * (mN - 1) / 2);
    }
    return mRow.coeff(mM);
  }
}
