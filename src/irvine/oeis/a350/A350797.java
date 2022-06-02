package irvine.oeis.a350;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A350797 Triangle read by rows: T(n,k) is the number of digraphs on n unlabeled nodes with k arcs and a global source (or sink), n &gt;= 1, k = 0..(n-1)^2.
 * @author Sean A. Irvine
 */
public class A350797 implements Sequence {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = Polynomial.create(Q.ZERO);

  protected Polynomial<Q> gfRow(final int n, final int m) {
    final int t = Math.min(m, (n - 1) * (n - 1));
    final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, t);
    final List<List<Polynomial<Q>>> graphs = GraphUtils.graphCycleIndexData(fld, n, Edges.DIGRAPH_EDGES, e -> fld.onePlusXToTheN(e));
    final Polynomial<Polynomial<Q>> res = GraphUtils.initiallyV(fld, graphs, e -> fld.onePlusXToTheN(e));
    return res.coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mM = 0;
      mRow = gfRow(++mN, (mN - 1) * (mN - 1));
    }
    return mRow.coeff(mM).toZ();
  }
}
