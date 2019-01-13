package irvine.math.matrix;

import irvine.math.api.Matrix;

/**
 * Default implementation of various matrix methods.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public abstract class AbstractMatrix<E> implements Matrix<E> {

  @Override
  public Matrix<E> delete(final long row, final long col) {
    return new MinorMatrix<>(this, row, col);
  }

  @Override
  public Matrix<E> transpose() {
    return new TransposeMatrix<>(this);
  }

  @Override
  public void swapRows(final long a, final long b) {
    if (a == b) {
      return;
    }
    for (long k = 0; k < cols(); ++k) {
      final E t = get(a, k);
      set(a, k, get(b, k));
      set(b, k, t);
    }
  }

  @Override
  public boolean isSquare() {
    return rows() == cols();
  }

  @Override
  public boolean isSymmetric() {
    if (!isSquare()) {
      return false;
    }
    for (long k = 0; k < rows(); ++k) {
      for (long j = k + 1; j < rows(); ++j) {
        if (!get(k, j).equals(get(j, k))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean equals(final Object o) {
    if (!(o instanceof Matrix)) {
      return false;
    }
    final Matrix<?> that = (Matrix<?>) o;
    if (rows() != that.rows() || cols() != that.cols()) {
      return false;
    }
    for (long r = 0; r < rows(); ++r) {
      for (long c = 0; c < cols(); ++c) {
        if (!get(r, c).equals(that.get(r, c))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    long h = 0;
    for (long r = 0; r < rows(); ++r) {
      for (long c = 0; c < cols(); ++c) {
        h += get(r, c).hashCode() * (c + 1) * (r + 1);
      }
    }
    return (int) h;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("[");
    for (long r = 0; r < rows(); ++r) {
      sb.append('[');
      for (long c = 0; c < cols(); ++c) {
        if (c != 0) {
          sb.append(' ');
        }
        sb.append(get(r, c));
      }
      sb.append(']');
    }
    return sb.append(']').toString();
  }
}
