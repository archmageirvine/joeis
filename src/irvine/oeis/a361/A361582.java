package irvine.oeis.a361;

import java.util.ArrayList;
import java.util.List;
import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A361582 Triangle read by rows: T(n,k) is the number of digraphs on n unlabeled nodes with k strongly connected components.
 * @author Gregory Morse
 */
public class A361582 extends Triangle {
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mOrder = -1;
  private Polynomial<Polynomial<Q>> mCounts;

  protected List<List<Q>> strongComponents(final int n) {
    final List<List<Q>> digraphs = GraphUtils.graphCycleIndexData(Rationals.SINGLETON, n, Edges.DIGRAPH_EDGES, e -> Q.TWO);
    final List<List<Q>> inverse = GraphUtils.invGgfCycleIndexData(Rationals.SINGLETON, digraphs, e -> Q.TWO);
    return GraphUtils.negate(Rationals.SINGLETON, GraphUtils.logCycleIndexData(Rationals.SINGLETON, inverse));
  }

  protected Polynomial<Q> mark(final int n) {
    return RING.x();
  }

  protected Polynomial<Polynomial<Q>> graphCounts(final int n) {
    // Invert the graphic generating function of signed sets of strong components.
    final List<List<Polynomial<Q>>> components = new ArrayList<>();
    for (final List<Q> row : strongComponents(n)) {
      final Polynomial<Q> variable = mark(components.size());
      final List<Polynomial<Q>> marked = new ArrayList<>();
      for (final Q c : row) {
        marked.add(RING.multiply(variable, c.negate()));
      }
      components.add(marked);
    }
    final List<List<Polynomial<Q>>> sets = GraphUtils.expCycleIndexData(RING, components);
    return GraphUtils.unlabeledOgf(RING, GraphUtils.invGgfCycleIndexData(RING, sets, e -> RING.monomial(Q.TWO, 0)));
  }

  protected final Polynomial<Q> row(final int n) {
    if (n > mOrder) {
      mCounts = graphCounts(n);
      mOrder = n;
    }
    return mCounts.coeff(n);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return row(n).coeff(k).toZ();
  }
}
