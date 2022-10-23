package irvine.oeis.a049;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049531 Number of digraphs with a source and a sink on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A049531 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final List<List<Q>> graphs = GraphUtils.graphCycleIndexData(Rationals.SINGLETON, mN, Edges.DIGRAPH_EDGES, e -> Q.TWO);
    final Polynomial<Q> res = GraphUtils.initiallyFinally(Rationals.SINGLETON, graphs, e -> Q.TWO);
    return res.coeff(mN).toZ();
  }
}
