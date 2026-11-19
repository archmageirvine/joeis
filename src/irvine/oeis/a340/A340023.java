package irvine.oeis.a340;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000670;

/**
 * A340023 Number of graphs with n integer labeled vertices covering an initial interval of positive integers.
 * @author Gregory Morse
 */
public class A340023 extends Sequence0 {
  private final A000670 mFubini = new A000670();
  private final boolean mConnected;
  private int mN = -1;

  protected A340023(final boolean connected) {
    mConnected = connected;
  }

  /** Construct the sequence. */
  public A340023() {
    this(false);
  }

  static List<List<Q>> graphCycleIndex(final int n) {
    return GraphUtils.graphCycleIndexData(Rationals.SINGLETON, n, Edges.GRAPH_EDGES, Q.TWO::pow);
  }

  protected List<Q> colorings(final int n) {
    final List<Q> res = new ArrayList<>();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      // An ordered partition of the vertex cycles assigns the colors.
      res.add(new Q(mFubini.a(p.length)));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final List<List<Q>> graphs = graphCycleIndex(mN);
    final List<Q> row = (mConnected ? GraphUtils.logCycleIndexData(Rationals.SINGLETON, graphs) : graphs).get(mN);
    final List<Q> colors = colorings(mN);
    Q sum = Q.ZERO;
    for (int k = 0; k < row.size(); ++k) {
      sum = sum.add(row.get(k).multiply(colors.get(k)));
    }
    return sum.divide(Functions.FACTORIAL.z(mN)).toZ();
  }
}
