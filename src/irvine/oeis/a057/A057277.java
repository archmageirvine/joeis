package irvine.oeis.a057;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057277 Triangle T(n,k) of number of digraphs with a source on n unlabeled nodes with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A057277 extends AbstractSequence {

  /* Construct the sequence. */
  public A057277() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = null;

  protected Polynomial<Q> gfRow(final int n, final int m) {
    final int t = Math.min(m, n * (n - 1));
    final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, t);
    final List<List<Polynomial<Q>>> graphs = GraphUtils.graphCycleIndexData(fld, n, Edges.DIGRAPH_EDGES, e -> fld.onePlusXToTheN(e));
    final Polynomial<Polynomial<Q>> res = GraphUtils.initially(fld, graphs, e -> fld.onePlusXToTheN(e));
    return res.coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      mM = 0;
      mRow = gfRow(++mN, mN * (mN - 1));
    }
    return mRow.coeff(mM).toZ();
  }
}
