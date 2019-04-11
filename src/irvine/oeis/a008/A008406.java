package irvine.oeis.a008;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A008406 Triangle T(n,k) read by rows, giving number of graphs with n nodes <code>(n &gt;= 1)</code> and k edges <code>(0 &lt;=</code> k <code>&lt;= n(n-1)/2)</code>.
 * Implementation derived from Maple code by Brendan McKay.
 * @author Sean A. Irvine
 */
public class A008406 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private CycleIndex z(final int n) {
    return SymmetricGroup.create(n).cycleIndex();
  }

  private final ArrayList<Polynomial<Q>> mStoredGeneratingFunctions = new ArrayList<>();
  {
    mStoredGeneratingFunctions.add(RING.zero());
  }

  private Polynomial<Q> gy(final int n) {
    while (n >= mStoredGeneratingFunctions.size()) {
      final int m = mStoredGeneratingFunctions.size();
      final CycleIndex zm = z(m);
      final CycleIndex z = zm.op(PairMultiply.OP, zm);
      mStoredGeneratingFunctions.add(z.applyOnePlusXToTheN());
    }
    return mStoredGeneratingFunctions.get(n);
  }

  /**
   * Number of simple graphs with given numbers of vertices and edges.
   * @param numVertex number of vertices
   * @param numEdges number of edges
   * @return number of graphs
   */
  public Z graphCount(final int numVertex, final int numEdges) {
    return gy(numVertex).coeff(numEdges).toZ();
  }

  private int mN = 0;
  private int mEdgeLimit = 0;
  private int mCurrentEdge = 1;

  @Override
  public Z next() {
    if (mCurrentEdge > mEdgeLimit) {
      ++mN;
      mEdgeLimit = mN * (mN - 1) / 2;
      mCurrentEdge = 0;
    }
    return graphCount(mN, mCurrentEdge++);
  }
}


