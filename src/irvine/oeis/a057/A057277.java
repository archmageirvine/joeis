package irvine.oeis.a057;

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
 * A057277 Triangle T(n,k) of number of digraphs with a source on n unlabeled nodes with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A057277 implements Sequence {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = null;

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      ++mN;
      mM = 0;
      final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, mN * (mN - 1));
      final List<List<Polynomial<Q>>> graphs = GraphUtils.graphCycleIndexData(fld, mN, Edges.DIGRAPH_EDGES, e -> fld.onePlusXToTheN(e));
      final Polynomial<Polynomial<Q>> res = GraphUtils.initially(fld, graphs, e -> fld.onePlusXToTheN(e));
      mRow = res.coeff(mN);
    }
    return mRow.coeff(mM).toZ();
  }
}
