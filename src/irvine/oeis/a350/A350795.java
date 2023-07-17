package irvine.oeis.a350;

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
 * A350795 Triangle read by rows: T(n,k) is the number of digraphs on n unlabeled nodes with k arcs and a global source and sink, n &gt;= 1, k = 0..max(1,n-1)*(n-2)+1.
 * @author Sean A. Irvine
 */
public class A350795 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A350795(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A350795() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = Polynomial.create(Q.ZERO);

  protected Polynomial<Q> gfRow(final int n, final int m) {
    final int t = Math.min(m, n * (n - 1)) + 1;
    final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, t);
    final List<List<Polynomial<Q>>> graphs = GraphUtils.graphCycleIndexData(fld, n, Edges.DIGRAPH_EDGES, e -> fld.onePlusXToTheN(e));
    final Polynomial<Polynomial<Q>> res = GraphUtils.initiallyFinallyV(fld, graphs, e -> fld.onePlusXToTheN(e));
    return res.coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mRow = gfRow(++mN, mN * (mN - 1));
      mM = 0;
    }
    return mRow.coeff(mM).toZ();
  }
}
