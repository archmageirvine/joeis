package irvine.oeis.a350;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a057.A057273;

/**
 * A350791 Triangle read by rows: T(n,k) is the number of digraphs on n labeled nodes with k arcs and a global source and sink, n &gt;= 1, k = 0..max(1,n-1)*(n-2)+1.
 * @author Gregory Morse
 */
public class A350791 extends A057273 {

  private static final Polynomial<Q> E = RING_Y.onePlusXToTheN(1);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = RING_Y.zero();

  private Polynomial<Q> row(final int n) {
    if (n == 1) {
      return RING_Y.one();
    }
    if (n == 2) {
      return RING_Y.monomial(Q.TWO, 1);
    }
    // Merge the endpoints; a source-to-sink arc becomes a loop at the marked vertex.
    final int k = n - 1;
    final Polynomial<Q> strong = strongD(k, k * (k - 1), E).coeff(k);
    // There are n*(n-1) ordered endpoint choices and the EGF divides by k!.
    return RING_Y.multiply(RING_Y.multiply(strong, E), new Q(Functions.FACTORIAL.z(n).multiply(k)));
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mRow = row(++mN);
      mM = 0;
    }
    return mRow.coeff(mM).toZ();
  }
}
