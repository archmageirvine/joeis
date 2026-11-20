package irvine.oeis.a350;

import java.util.List;
import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A350733 Triangle read by rows: T(n,k) is the number of oriented graphs on n unlabeled nodes with k arcs, n &gt;= 0, k = 0..n*(n-1)/2.
 * @author Gregory Morse
 */
public class A350733 extends AbstractSequence {
  private int mN;
  private int mM = -1;
  private Polynomial<Q> mRow;

  /**
   * Construct an arc table starting at the given order.
   * @param offset first index and first vertex count
   */
  protected A350733(final int offset) {
    super(offset);
    mN = offset;
  }

  /** Construct the sequence. */
  public A350733() {
    this(0);
  }

  protected Polynomial<Polynomial<Q>> graphCounts(final PolynomialRingField<Q> fld, final List<List<Polynomial<Q>>> data) {
    return GraphUtils.unlabeledOgf(fld, data);
  }

  protected final Polynomial<Polynomial<Q>> counts(final int n, final int m) {
    final PolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final List<List<Polynomial<Q>>> data = GraphUtils.graphCycleIndexData(fld, n, Edges.ORIENTED_GRAPH_EDGES,
      e -> fld.add(fld.one(), fld.monomial(Q.TWO, e)));
    return graphCounts(fld, data);
  }

  @Override
  public Z next() {
    if (++mM > (long) mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      mRow = counts(mN, mN * (mN - 1) / 2).coeff(mN);
    }
    return mRow.coeff(mM).toZ();
  }
}
