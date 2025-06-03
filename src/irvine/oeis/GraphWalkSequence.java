package irvine.oeis;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Number of walks of length n on a graph starting at a specified vertex.
 * @author Sean A. Irvine
 */
public class GraphWalkSequence extends Sequence0 {

  private final MatrixRing<Z> mRing;
  private final Matrix<Z> mAdjacencyMatrix;
  private final Matrix<Z> mStart;
  private long mN = -1;

  /**
   * Construct a new walk counting sequence for the given adjacency matrix and start vertex.
   * @param adjacencyMatrix adjacency matrix of graph
   * @param startVertex starting vertex for the walk
   */
  protected GraphWalkSequence(final long[][] adjacencyMatrix, final long startVertex) {
    if (startVertex < 0 || startVertex >= adjacencyMatrix.length) {
      throw new IllegalArgumentException();
    }
    mRing = new MatrixRing<>(adjacencyMatrix.length, Integers.SINGLETON);
    final Z[][] m = new Z[adjacencyMatrix.length][];
    for (int k = 0; k < adjacencyMatrix.length; ++k) {
      m[k] = ZUtils.toZ(adjacencyMatrix[k]);
    }
    mAdjacencyMatrix = new DefaultMatrix<>(m, Z.ZERO);
    mStart = new DefaultMatrix<>(1, adjacencyMatrix.length, Z.ZERO);
    mStart.set(0, startVertex, Z.ONE);
  }

  @Override
  public Z next() {
    final Matrix<Z> m = mRing.multiply(mStart, mRing.pow(mAdjacencyMatrix, ++mN));
    Z sum = Z.ZERO;
    for (long k = 0; k < m.cols(); ++k) {
      sum = sum.add(m.get(0, k));
    }
    return sum;
  }

  /**
   * Run on the specified matrix
   * @param args start vertex, then the matrix (binary adjacency matrix, one row at a time).
   */
  public static void main(final String[] args) {
    final int s = args.length - 1;
    final long[][] m = new long[s][s];
    for (int r = 0; r < s; ++r) {
      for (int c = 0; c < s; ++c) {
        m[r][c] = args[r + 1].charAt(c) - '0';
      }
    }
    final GraphWalkSequence seq = new GraphWalkSequence(m, Integer.parseInt(args[0]));
    while (true) {
      System.out.println(seq.next());
    }
  }
}
