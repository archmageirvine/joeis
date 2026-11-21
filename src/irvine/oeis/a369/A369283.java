package irvine.oeis.a369;

import irvine.math.group.PolynomialRing;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A369283 Triangle read by rows: T(n,k) is the number of labeled point-determining graphs with n nodes and k edges, n &gt;= 0, 0 &lt;= k &lt;= n*(n - 1)/2.
 * @author Gregory Morse
 */
public class A369283 extends Sequence0 {
  // After Andrew Howroyd.
  protected static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 1;
  private Polynomial<Z> mRow = RING.one();

  protected Polynomial<Z> row(final int n) {
    final IntegerPartition partitions = new IntegerPartition(n);
    Polynomial<Z> sum = RING.zero();
    int[] p;
    while ((p = partitions.next()) != null) {
      Polynomial<Z> graph = RING.one();
      for (int i = 1; i < p.length; ++i) {
        for (int j = 0; j < i; ++j) {
          graph = RING.multiply(graph, RING.onePlusXToTheN(p[i] * p[j]));
        }
      }
      sum = RING.signedAdd(((n - p.length) & 1) == 0, sum, RING.multiply(graph, IntegerPartition.permCount(p)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      mRow = row(++mN);
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
