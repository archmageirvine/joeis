package irvine.oeis.a340;

import java.util.List;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A340022 Number of graphs with vertices labeled with positive integers summing to n.
 * @author Gregory Morse
 */
public class A340022 extends Sequence0 {
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final List<List<Q>> graphs = A340023.graphCycleIndex(mN);
    Q sum = Q.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final int degree = mN - k;
      final IntegerPartition part = new IntegerPartition(k);
      Q row = Q.ZERO;
      int[] p;
      int j = 0;
      while ((p = part.next()) != null) {
        Polynomial<Q> denominator = RING.one();
        for (final int d : p) {
          // A cycle of length d contributes a positive multiple of d.
          if (d <= degree) {
            denominator = RING.multiply(denominator, RING.oneMinusXToTheN(Q.ONE, d), degree);
          }
        }
        row = row.add(graphs.get(k).get(j++).multiply(RING.series(RING.one(), denominator, degree).coeff(degree)));
      }
      sum = sum.add(row.divide(Functions.FACTORIAL.z(k)));
    }
    return sum.toZ();
  }
}
