package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.List;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.MaximalCliques;
import irvine.math.partition.DistinctPartsPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068598 Number of maximal sets of partitions of n with property that all parts in all partitions in the set are distinct.
 * @author Sean A. Irvine
 */
public class A068598 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ONE;
    }
    final List<Long> partitionList = new ArrayList<>();
    final DistinctPartsPartition part = new DistinctPartsPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      long v = 0;
      for (final int t : p) {
        v |= 1L << t;
      }
      partitionList.add(v);
    }
    final Graph g = GraphFactory.create(partitionList.size());
    for (int k = 1; k < partitionList.size(); ++k) {
      final long pk = partitionList.get(k);
      for (int j = 0; j < k; ++j) {
        if ((partitionList.get(j) & pk) == 0) {
          g.addEdge(k, j);
        }
      }
    }
    return Z.valueOf(MaximalCliques.maximalCliques(g).size());
  }
}
