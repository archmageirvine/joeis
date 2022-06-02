package irvine.oeis.a350;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A350489 Number of strongly connected oriented graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A350489 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return GraphUtils.strong(Rationals.SINGLETON, GraphUtils.graphCycleIndexData(Rationals.SINGLETON, mN, Edges.ORIENTED_GRAPH_EDGES, e -> Q.THREE), e -> Q.TWO).coeff(mN).toZ();
  }
}
