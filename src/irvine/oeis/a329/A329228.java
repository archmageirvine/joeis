package irvine.oeis.a329;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A329228 Triangle read by rows: T(n,k) is the number of digraphs on n unlabeled vertices such that every vertex has outdegree k, n &gt;= 1, 0 &lt;= k &lt; n.
 * @author Gregory Morse
 */
public class A329228 extends Triangle {
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final MemoryFunction1<Polynomial<Q>> mOutdegrees = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      final IntegerPartition part = new IntegerPartition(n);
      Polynomial<Q> sum = RING.zero();
      int[] p;
      while ((p = part.next()) != null) {
        Polynomial<Q> fixed = null;
        for (int i = 0; i < p.length; ++i) {
          Polynomial<Q> row = RING.one();
          for (int j = 0; j < p.length; ++j) {
            final int g = Functions.GCD.i(p[i], p[j]);
            // Each chosen orbit adds p[j]/g to the outdegree; omit the loop orbit.
            row = RING.multiply(row, RING.pow(RING.onePlusXToTheN(p[j] / g), g - (i == j ? 1 : 0)));
          }
          fixed = fixed == null ? row : RING.hadamardMultiply(fixed, row);
        }
        sum = RING.add(sum, RING.multiply(fixed, new Q(IntegerPartition.permCount(p))));
      }
      return RING.multiply(sum, new Q(Z.ONE, Functions.FACTORIAL.z(n)));
    }
  };

  /** Construct the sequence. */
  public A329228() {
    setOffset(1);
  }

  protected Polynomial<Q> outdegrees(final int n) {
    return mOutdegrees.get(n);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return outdegrees(n + 1).coeff(k).toZ();
  }
}
