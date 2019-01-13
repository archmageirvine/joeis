package irvine.math.matrix;

import irvine.math.api.Matrix;

/**
 * Matrix factory.
 * @author Sean A. Irvine
 */
public final class BinaryMatrixFactory {

  private BinaryMatrixFactory() { }

  /**
   * Create the a matrix of specified size.
   *
   * @param rows rows
   * @param cols columns
   * @return zero matrix
   */
  public static Matrix<Boolean> create(final int rows, final int cols) {
    return new DefaultBinaryMatrix(rows, cols);
  }

}

