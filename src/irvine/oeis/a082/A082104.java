package irvine.oeis.a082;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.api.Matrix;
import irvine.math.graph.Graph;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A082104 Number of distinct characteristic polynomials among all simple undirected graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A082104 extends ParallelGenerateGraphsSequence {

  private static final PolynomialRing<Z> POLY = new PolynomialRing<>(IntegerField.SINGLETON);
  private static final Set<Polynomial<Z>> SEEN = Collections.synchronizedSet(new HashSet<>());
  private static MatrixRing<Polynomial<Z>> RING = null;

  private static Polynomial<Z> characteristicPolynomial(final Graph graph) {
    final int n = graph.order();
    final Matrix<Polynomial<Z>> lambda = new DefaultMatrix<>(n, n, POLY.zero());
    for (int row = 0; row < n; ++row) {
      for (int col = 0; col < n; ++col) {
        final Polynomial<Z> p = new Polynomial<>("x", Z.ZERO, Z.ONE);
        p.add(graph.isAdjacent(row, col) ? Z.NEG_ONE : Z.ZERO); // Add constant term
        if (row == col) {
          p.add(Z.ONE); // Add "x"
        }
        p.fixDegree();
        lambda.set(row, col, p);
      }
    }
    return RING.det(lambda);
  }

  /** Construct the sequence. */
  public A082104() {
    super(1, 0, 0, 0, () -> graph -> SEEN.add(characteristicPolynomial(graph)) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }

  @Override
  public Z next() {
    SEEN.clear();
    RING = new MatrixRing<>(mN + 1, POLY);
    return super.next();
  }
}
