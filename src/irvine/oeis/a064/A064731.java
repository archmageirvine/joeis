package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.api.Matrix;
import irvine.math.graph.GraphUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A064731 Number of connected integral graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A064731 extends ParallelGenerateGraphsSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private static boolean is(final Polynomial<Z> cp) {
    if (cp.degree() == 0) {
      return true;
    }
    final Z c0 = cp.coeff(0);
    if (c0.isZero()) {
      return is(cp.shift(-1));
    }
    for (final Z d : Jaguar.factor(c0).divisors()) {
      if (RING.eval(cp, d).isZero()) {
        final Polynomial<Z> t = RING.divide(cp, Polynomial.create(d.negate(), Z.ONE));
        if (is(t)) {
          return true;
        }
      }
    }
    return false;
  }

  /** Construct the sequence. */
  public A064731() {
    super(1, 0, 1, 0, () -> graph -> {
      // Graph is integral if its characteristic polynomial factors over the integers
      final MatrixRing<Z> ring = new MatrixRing<>(graph.order(), Integers.SINGLETON);
      final Matrix<Z> adj = GraphUtils.toAdjacencyMatrix(graph);
      final Polynomial<Z> cp = ring.characteristicPolynomial(adj);
      //System.out.println(graph + " " + adj + " " + cp + " " + is(cp));
      return is(cp) ? 1 : 0;
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
