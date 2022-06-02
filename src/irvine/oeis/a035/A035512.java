package irvine.oeis.a035;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035512 Number of unlabeled strongly connected digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A035512 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return GraphUtils.strong(Rationals.SINGLETON, GraphUtils.graphCycleIndexData(Rationals.SINGLETON, mN, Edges.DIGRAPH_EDGES, e -> Q.TWO), e -> Q.TWO).coeff(mN).toZ();
  }
}
