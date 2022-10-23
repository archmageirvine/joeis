package irvine.oeis.a051;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051421 Number of digraphs on n unlabeled nodes with a sink (or, with a source).
 * @author Sean A. Irvine
 */
public class A051421 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final List<List<Z>> graphs = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, mN, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final Polynomial<Z> res = GraphUtils.initially(IntegerField.SINGLETON, graphs, e -> Z.TWO);
    return res.coeff(mN);
  }
}
