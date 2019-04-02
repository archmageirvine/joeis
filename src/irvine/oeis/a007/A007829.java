package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007829 From random walks on complete directed triangle.
 * @author Sean A. Irvine
 */
public class A007829 implements Sequence {

  private static final int VERTICES = 3;
  private static final int EDGES = 2 * VERTICES;
  private static final int EDGE_MASK = (1 << EDGES) - 1;
  private Z[] mCount = new Z[VERTICES * (1 << EDGES)]; // 3 nodes, 6 edges
  {
    Arrays.fill(mCount, Z.ZERO);
    mCount[0] = Z.ONE;
  }

  @Override
  public Z next() {
    final Z[] old = mCount;
    mCount = new Z[old.length];
    Arrays.fill(mCount, Z.ZERO);
    for (int k = 0; k < old.length; ++k) {
      final int edgeState = k & EDGE_MASK;
      final int vertex = k >>> EDGES;
      // increasing vertex
      final int forwardVertex = (vertex + 1) % VERTICES;
      final int forwardEdge = 1 << vertex;
      final int newForwardState = (forwardVertex << EDGES) | edgeState | forwardEdge;
      mCount[newForwardState] = mCount[newForwardState].add(old[k]);
      final int reverseVertex = (vertex + VERTICES - 1) % VERTICES;
      final int reverseEdge = 1 << (VERTICES + vertex);
      final int newReverseState = (reverseVertex << EDGES) | edgeState | reverseEdge;
      mCount[newReverseState] = mCount[newReverseState].add(old[k]);
    }
    Z sum = Z.ZERO;
    for (int k = EDGE_MASK; k < mCount.length; k += 1 << EDGES) {
      sum = sum.add(mCount[k]);
      mCount[k] = Z.ZERO; // don't contribute further going forward
    }
    return sum;
  }
}
