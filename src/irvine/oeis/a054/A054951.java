package irvine.oeis.a054;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.group.IntegerField;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054951 Number of unlabeled semi-strong digraphs on n nodes with mutually nonisomorphic components.
 * @author Sean A. Irvine
 */
public class A054951 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final List<List<Z>> gcid = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, ++mN, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    return GraphUtils.stronglyConnected(IntegerField.SINGLETON, gcid, e -> Z.TWO).coeff(mN);
  }
}
