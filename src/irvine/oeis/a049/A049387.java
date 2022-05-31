package irvine.oeis.a049;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049387 Number of rooted unlabeled strongly connected digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A049387 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final List<List<Z>> graphs = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, mN, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final Polynomial<Z> res = GraphUtils.rootedStronglyConnected(IntegerField.SINGLETON, graphs, e -> Z.TWO);
    return res.coeff(mN);
  }
}
