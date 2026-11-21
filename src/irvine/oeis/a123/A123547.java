package irvine.oeis.a123;

import irvine.math.group.PolynomialRing;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;

/**
 * A123547 Triangle read by rows: T(n,k) = number of unlabeled bicolored graphs with no isolated nodes having 2n nodes and k edges, with n nodes of each color. Here n &gt;= 0, 0 &lt;= k &lt;= n^2.
 * @author Gregory Morse
 */
public class A123547 extends A123548 {
  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);

  private Polynomial<Q> fixedColors(final int m, final int n) {
    if (m == 0 || n == 0) {
      return RING.one();
    }
    final CycleIndex left = SymmetricGroup.create(m).cycleIndex();
    final CycleIndex right = SymmetricGroup.create(n).cycleIndex();
    return left.op(HararyMultiply.OP, right).applyOnePlusXToTheN();
  }

  @Override
  protected Polynomial<Q> row(final int n) {
    // Remove isolated vertices in each color class before averaging over the color swap.
    final Polynomial<Q> fixed = RING.add(RING.subtract(fixedColors(n, n), RING.multiply(fixedColors(n - 1, n), Q.TWO)), fixedColors(n - 1, n - 1));
    final Polynomial<Q> swapped = RING.subtract(super.row(n), n == 1 ? RING.one() : super.row(n - 1));
    return RING.multiply(RING.add(fixed, swapped), Q.HALF);
  }
}
