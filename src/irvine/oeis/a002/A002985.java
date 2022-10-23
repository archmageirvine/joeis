package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002985 Number of trees in an n-node wheel.
 * @author Sean A. Irvine
 */
public class A002985 extends Sequence1 {

  // See a002985.tex for some hints on the method used here.

  private static final class Tree implements Comparable<Tree> {

    private final List<Tree> mChildren = new ArrayList<>();
    private int mChildCount;

    private Tree(final Graph graph, final int root, final boolean[] used) {
      assert !used[root];
      used[root] = true;
      int v = -1;
      while ((v = graph.nextVertex(root, v)) != -1) {
        if (!used[v]) {
          mChildren.add(new Tree(graph, v, used));
        }
      }
      int c = 0;
      for (final Tree t : mChildren) {
        c += t.mChildCount;
      }
      mChildCount = c;
    }

    private Tree(final Graph graph, final int root) {
      this(graph, root, new boolean[graph.order()]);
    }

    @Override
    public int hashCode() {
      int h = 0;
      int k = 0;
      for (final Tree t : mChildren) {
        h += ++k * t.hashCode();
      }
      return h;
    }

    @Override
    public int compareTo(final Tree t) {
      final int cc = Integer.compare(t.mChildCount, mChildCount);
      if (cc != 0) {
        return cc;
      }
      final int nc = Integer.compare(t.mChildren.size(), mChildren.size());
      if (nc != 0) {
        return nc;
      }
      for (int k = 0; k < mChildren.size(); ++k) {
        final int subtreeCompare = mChildren.get(k).compareTo(t.mChildren.get(k));
        if (subtreeCompare != 0) {
          return subtreeCompare;
        }
      }
      return 0;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Tree && compareTo((Tree) obj) == 0;
    }

    private void canonicalize() {
      for (final Tree c : mChildren) {
        c.canonicalize();
      }
      Collections.sort(mChildren);
    }

//    private String toDotty(final String nodeName) {
//      final StringBuilder sb = new StringBuilder();
//      for (int k = 0; k < mChildren.size(); ++k) {
//        final String childName = nodeName + "_" + k;
//        sb.append(nodeName).append("->").append(childName).append('\n');
//        sb.append(mChildren.get(k).toDotty(childName));
//      }
//      return sb.toString();
//    }
//
//    private String toDotty() {
//      return "digraph {\n"
//        + "node [shape=circle,style=filled,fillcolor=black,fixedsize=true,width=0.1,label=\"\"]\n"
//        + "edge [dir=none]\n"
//        + toDotty("n0")
//        + "}\n";
//    }
//
//    private String toString(final String prefix) {
//      final StringBuilder sb = new StringBuilder();
//      sb.append(prefix).append("X\n");
//      for (final Tree c : mChildren) {
//        sb.append(c.toString(prefix + " "));
//      }
//      return sb.toString();
//    }
//
//    @Override
//    public String toString() {
//      return toString("");
//    }
  }

  private long maxDegree(final Graph graph) {
    long max = 0;
    for (int k = 0; k < graph.order(); ++k) {
      if (graph.degree(k) > max) {
        max = graph.degree(k);
      }
    }
    return max;
  }

  private void generate(final Set<Tree> trees, final Graph graph, final int[] partition, final int pos, final int startNode) {
    if (pos == partition.length) {
      Tree canon = null;
      final long maxDegree = maxDegree(graph);
      for (int k = 0; k < graph.order(); ++k) {
        if (graph.degree(k) == maxDegree) {
          final Tree t = new Tree(graph, k);
          t.canonicalize();
          if (canon == null || t.compareTo(canon) > 0) {
            canon = t;
          }
        }
      }
      trees.add(canon);
      return;
    }

    // Partition is always organized from biggest to smallest part
    final int p = partition[pos];
    final int endNode = startNode + p - 1;
    graph.addEdge(0, startNode); // Connect center to first node of partition
    for (int k = 0; k <= (p - 1) / 2; ++k) {
      // k is split point along the p nodes that comprise this part of the tree
      int i = startNode;
      for (int j = 1; j <= k; ++j, ++i) {
        graph.addEdge(i, i + 1);
      }
      if (++i <= endNode) {
        graph.addEdge(startNode, i);
        while (i < endNode) {
          graph.addEdge(i, i + 1);
          ++i;
        }
      }

      generate(trees, graph, partition, pos + 1, startNode + p);

      i = startNode;
      for (int j = 1; j <= k; ++j, ++i) {
        graph.removeEdge(i, i + 1);
      }
      if (++i <= endNode) {
        graph.removeEdge(startNode, i);
        while (i < endNode) {
          graph.removeEdge(i, i + 1);
          ++i;
        }
      }


    }
    graph.removeEdge(0, startNode);
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    final HashSet<Tree> trees = new HashSet<>();
    final Graph g = GraphFactory.create(mN);
    final IntegerPartition part = new IntegerPartition(mN - 1);
    int[] p;
    while ((p = part.next()) != null) {
      generate(trees, g, p, 0, 1);
    }
    return Z.valueOf(trees.size());
  }
}
