package irvine.math.matrix;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import irvine.math.api.Matrix;

/**
 * Utility functions for I/O operations on matrices.
 * @author Sean A. Irvine
 */
public final class MatrixIO {

  private MatrixIO() { }

  /**
   * Defined matrix formats.
   */
  public enum MatrixFileFormat {
    /** Simple ASCII format. */
    ASCII
  }

  private static void writeAscii(final Matrix<Boolean> matrix, final OutputStream os) {
    try (final PrintStream ps = new PrintStream(new BufferedOutputStream(os))) {
      ps.println('A');
      ps.println(matrix.rows());
      ps.println(matrix.cols());
      for (int y = 0; y < matrix.rows(); ++y) {
        for (int x = 0; x < matrix.cols(); ++x) {
          ps.print(matrix.get(y, x) ? '1' : '0');
        }
        ps.println();
      }
    }
  }

  /**
   * Write the matrix in a specified format.  If the specified format is not
   * supported, then an <code>UnsupportedOperationException</code> may be thrown.
   * If the specified <code>format</code> is <code>null</code>, then the
   * implementation is free to choose any format it likes.
   * @param matrix matrix to write
   * @param os stream to write matrix to
   * @param format write to use during writing
   */
  public static void save(final Matrix<Boolean> matrix, final OutputStream os, final MatrixFileFormat format) {
    if (format == null) {
      writeAscii(matrix, os);
    } else {
      switch (format) {
      case ASCII:
        writeAscii(matrix, os);
        break;
      default:
        throw new UnsupportedOperationException();
      }
    }
  }

  private static int readInt(final BufferedReader r) throws IOException {
    final String s = r.readLine();
    if (s == null) {
      throw new IOException();
    }
    return Integer.parseInt(s);
  }

  private static Matrix<Boolean> loadAscii(final InputStream is) throws IOException {
    try (BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
      final String x1 = r.readLine();
      if (x1 == null || !x1.isEmpty()) {
        throw new IOException();
      }
      final int rows = readInt(r);
      final int cols = readInt(r);
      final Matrix<Boolean> m = BinaryMatrixFactory.create(rows, cols);
      for (int k = 0; k < rows; ++k) {
        final String line = r.readLine();
        if (line == null || line.length() != cols) {
          throw new IOException();
        }
        for (int j = 0; j < cols; ++j) {
          m.set(k, j, line.charAt(j) != '0');
        }
      }
      return m;
    }
  }

  /**
   * Load a matrix.
   *
   * @param is stream supplying the matrix
   * @return a matrix
   * @exception IOException if an I/O error occurs
   */
  public static Matrix<Boolean> load(final InputStream is) throws IOException {
    final int magic = is.read();
    if (magic == 'A') {
      return loadAscii(is);
    }
    throw new UnsupportedOperationException();
  }
}

