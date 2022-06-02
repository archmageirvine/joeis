package irvine.oeis.a350;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A350794 Number of digraphs on n unlabeled nodes with a global source and sink.
 * @author Sean A. Irvine
 */
public class A350794 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final List<List<Q>> graphs = GraphUtils.graphCycleIndexData(Rationals.SINGLETON, mN, Edges.DIGRAPH_EDGES, e -> Q.TWO);
    final Polynomial<Q> res = GraphUtils.initiallyFinallyV(Rationals.SINGLETON, graphs, e -> Q.TWO);
    return res.coeff(mN).toZ();
  }
}
