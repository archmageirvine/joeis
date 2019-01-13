package irvine.math.matrix;

import java.util.ArrayList;
import java.util.BitSet;

import irvine.math.api.Matrix;

/**
 * A straightforward implementation using <code>O(rows()*cols())</code> memory.
 * @author Sean A. Irvine
 */
public class DefaultBinaryMatrix extends AbstractMatrix<Boolean> {

  private final BitSet[] mMatrix;
  private final int mCols;

  static DefaultBinaryMatrix identity(final int size) {
    final DefaultBinaryMatrix m = new DefaultBinaryMatrix(size, size);
    for (int k = 0; k < size; ++k) {
      m.set(k, k, Boolean.TRUE);
    }
    return m;
  }

  DefaultBinaryMatrix(final int rows, final int cols) {
    mCols = cols;
    mMatrix = new BitSet[rows];
    for (int k = 0; k < rows; ++k) {
      mMatrix[k] = new BitSet(cols);
    }
  }

  @Override
  public long rows() {
    return mMatrix.length;
  }

  @Override
  public long cols() {
    return mCols;
  }

  @Override
  public Boolean get(final long row, final long col) {
    if (row < 0 || col < 0 || row > rows() || col > cols()) {
      throw new IllegalArgumentException();
    }
    return mMatrix[(int) row].get((int) col);
  }

  @Override
  public void set(final long row, final long col, final Boolean element) {
    if (row < 0 || col < 0 || row >= rows() || col >= cols()) {
      throw new IllegalArgumentException("(" + row + "," + col + ") exceeds (" + rows() + "," + cols() + ")");
    }
    mMatrix[(int) row].set((int) col, element);
  }

  /**
   * Total number of set bits in this binary matrix.
   * @return population count
   */
  public long popcount() {
    long c = 0;
    for (final BitSet b : mMatrix) {
      c += b.cardinality();
    }
    return c;
  }

  /**
   * Compute linear dependencies.
   * @param max maximum dependencies to report
   * @return matrix with dependences
   */
  public Matrix<Boolean> linearDependencies(final int max) {
    final DefaultBinaryMatrix h = identity((int) rows());
    for (int i = 0; i < rows(); ++i) {
      final int j = mMatrix[i].nextSetBit(0);
      if (j >= 0) {
        for (int k = i + 1; k < rows(); ++k) {
          if (mMatrix[k].get(j)) {
            mMatrix[k].xor(mMatrix[i]);
            h.mMatrix[k].xor(h.mMatrix[i]);
          }
        }
      }
    }
    // test linear dependencies
    final ArrayList<BitSet> dependencies = new ArrayList<>();
    for (int i = 0; i < rows() && dependencies.size() < max; ++i) {
      if (mMatrix[i].isEmpty()) {
        // should really clone this row
        dependencies.add(h.mMatrix[i]);
      }
    }

    // todo: this as a private constructor
    final DefaultBinaryMatrix res = new DefaultBinaryMatrix(dependencies.size(), (int) rows());
    for (int k = 0; k < dependencies.size(); ++k) {
      res.mMatrix[k] = dependencies.get(k);
    }
    return res;
  }

  @Override
  public void swapRows(final long a, final long b) {
    final BitSet t = mMatrix[(int) a];
    mMatrix[(int) a] = mMatrix[(int) b];
    mMatrix[(int) b] = t;
  }

  @Override
  public boolean isDiagonal() {
    if (!isSquare()) {
      return false;
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUpperTriangular() {
    if (!isSquare()) {
      return false;
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isLowerTriangular() {
    if (!isSquare()) {
      return false;
    }
    throw new UnsupportedOperationException();
  }

}
