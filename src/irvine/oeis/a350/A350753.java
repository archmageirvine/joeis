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
 * A350753 Triangle read by rows: T(n,k) is the number of unlabeled strongly connected digraphs with n arcs and k vertices, n &gt;= 0, k = 1..n+1.
 * @author Sean A. Irvine
 */
public class A350753 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  private Polynomial<Q> gfRow(final int n, final int m) {
    final int t = Math.min(m, n * (n - 1));
    final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, t);
    final List<List<Polynomial<Q>>> graphs = GraphUtils.graphCycleIndexData(fld, n, Edges.DIGRAPH_EDGES, e -> fld.onePlusXToTheN(e));
    final Polynomial<Polynomial<Q>> res = GraphUtils.strong(fld, graphs, e -> fld.onePlusXToTheN(e));
    return res.coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > mN + 1) {
      ++mN;
      mM = 1;
    }
    return gfRow(mM, mN).coeff(mN).toZ();
  }
}
