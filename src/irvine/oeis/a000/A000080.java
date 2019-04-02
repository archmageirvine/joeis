package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.graph.Graph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000080 Number of nonisomorphic minimal triangle graphs.
 * @author Sean A. Irvine
 */
public class A000080 implements Sequence {

  private static class Triangle {
    final int mA, mB, mC;
    Triangle(final int a, final int b, final int c) {
      assert a != b && a != c && b != c;
      mA = a;
      mB = b;
      mC = c;
    }
  }

  private int mN = 2;

  private ArrayList<Triangle[]> mA = null;
  private ArrayList<Triangle[]> mB = null;

  private Graph<Integer, Integer> trianglesToGraph(final Triangle[] triangles) {
    final int vertexCount = mN;
    final boolean[][] incidence = new boolean[vertexCount][vertexCount];
    for (final Triangle t : triangles) {
      if (t != null) {
        incidence[t.mA][t.mB] = true;
        incidence[t.mA][t.mC] = true;
        incidence[t.mB][t.mC] = true;
      }
    }
    final Graph<Integer, Integer> g = new Graph<>();
    for (int k = 0; k < vertexCount; ++k) {
      g.addVertex(k);
    }
    for (int k = 0; k < incidence.length; ++k) {
      for (int j = k + 1; j < incidence.length; ++j) {
        if (incidence[k][j] || incidence[j][k]) {
          g.addEdge(g.getVertex(k), g.getVertex(j), null);
        }
      }
    }
    return g;
  }

  private void verifyAndAdd2(final List<Triangle[]> triangles, final List<Graph<Integer, Integer>> graphs, final Triangle[] root, final int k) {

    // We propose to add the new triangle k-(mN-1)-(mN-2).  That is, we
    // are adding two new vertices, it is trivial that the graph will
    // remain connected on deletion of any triangle, so there is no need
    // to test for that

    final Triangle[] candidate = Arrays.copyOf(root, root.length + 1);
    candidate[root.length] = new Triangle(k, mN - 2, mN - 1);
    final Graph<Integer, Integer> candidateGraph = trianglesToGraph(candidate);
    for (final Graph<Integer, Integer> g : graphs) {
      if (g.isIsomorphic(candidateGraph)) {
        return;
      }
    }
    graphs.add(candidateGraph);
    triangles.add(candidate);
  }

  private void verifyAndAdd1(final List<Triangle[]> triangles, final List<Graph<Integer, Integer>> graphs, final Triangle[] root, final int[] degree, final int j, final int k) {

    // We propose to add the new triangle j-k-(mN-1).  However, we first need to
    // examine the existing triangles to check if the graph would remain
    // connected if the triangle was deleted.

    degree[k]++;
    degree[j]++;

    final Triangle[] candidate = Arrays.copyOf(root, root.length + 1);
    candidate[root.length] = new Triangle(k, j, mN - 1);

    // There is no need to consider elimination of any triangle containing
    // a vertex not touching any other triangle
    for (int i = 0; i < candidate.length - 1; ++i) {
      final Triangle t = candidate[i];
      if (degree[t.mA] > 1 && degree[t.mB] > 1 && degree[t.mC] > 1) {
        candidate[i] = null;
        final Graph<Integer, Integer> o = trianglesToGraph(candidate);
        candidate[i] = t;
        if (o.isConnected()) {
          degree[k]--;
          degree[j]--;
          return;
        }
      }
    }

    degree[k]--;
    degree[j]--;

    // Check for an isomorphism
    final Graph<Integer, Integer> candidateGraph = trianglesToGraph(candidate);
    for (final Graph<Integer, Integer> g : graphs) {
      if (g.isIsomorphic(candidateGraph)) {
        return;
      }
    }

    graphs.add(candidateGraph);
    triangles.add(candidate);
  }

  @Override
  public Z next() {
    ++mN;
    // Base cases
    if (mN == 3) {
      mA = new ArrayList<>();
      mA.add(new Triangle[] {new Triangle(0, 1, 2)});
      return Z.ONE;
    }
    if (mN == 4) {
      mB = new ArrayList<>();
      mB.add(new Triangle[] {new Triangle(0, 1, 2), new Triangle(0, 1, 3)});
      return Z.ONE;
    }
    // General case
    // Add two new vertices in every possible way to graphs in mA
    final ArrayList<Triangle[]> triangles = new ArrayList<>();
    final ArrayList<Graph<Integer, Integer>> graphs = new ArrayList<>();
    for (final Triangle[] s : mA) {
      // new node names will be mN - 2 and mN - 1
      for (int k = 0; k < mN - 2; ++k) {
        verifyAndAdd2(triangles, graphs, s, k);
      }
    }
    // Add one new vertex in every possible way to graphs in mB
    for (final Triangle[] s : mB) {
      final int[] degree = new int[mN];
      for (final Triangle z : s) {
        degree[z.mA]++;
        degree[z.mB]++;
        degree[z.mC]++;
      }
      // new node name will be mN - 1
      for (int k = 0; k < mN - 2; ++k) {
        for (int j = k + 1; j < mN - 1; ++j) {
          verifyAndAdd1(triangles, graphs, s, degree, k, j);
        }
      }
    }

    mA = mB;
    mB = triangles;
    return Z.valueOf(mB.size());
  }
}
