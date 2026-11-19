package irvine.oeis.a340;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.q.Rationals;

/**
 * A340024 Number of inequivalent vertex colorings of graphs on n unlabeled vertices.
 * @author Gregory Morse
 */
public class A340024 extends A340023 {
  protected A340024(final boolean connected) {
    super(connected);
  }

  /** Construct the sequence. */
  public A340024() {
    this(false);
  }

  @Override
  protected List<Q> colorings(final int n) {
    final List<List<Q>> atoms = new ArrayList<>();
    atoms.add(Collections.singletonList(Q.ZERO));
    atoms.add(Collections.singletonList(Q.ONE));
    for (int k = 2; k <= n; ++k) {
      atoms.add(Collections.nCopies(Functions.PARTITIONS.i(k), Q.ZERO));
    }
    // An unordered coloring is a set of nonempty sets of vertices.
    final List<List<Q>> blocks = GraphUtils.expCycleIndexData(Rationals.SINGLETON, atoms);
    blocks.set(0, Collections.singletonList(Q.ZERO));
    final List<Q> res = GraphUtils.expCycleIndexData(Rationals.SINGLETON, blocks).get(n);
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    int k = 0;
    while ((p = part.next()) != null) {
      res.set(k, res.get(k).divide(IntegerPartition.permCount(p)));
      ++k;
    }
    return res;
  }
}
