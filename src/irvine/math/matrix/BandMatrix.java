package irvine.math.matrix;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * Band matrix.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public class BandMatrix<E> extends AbstractMatrix<E> {

  private final long mRows;
  private final int mBandWidth;
  private final E mZero;
  private final int mMid;

  // Diagonals of the matrix
  private final E[][] mData;

  /**
   * Convenience method to create a band matrix over the integers.
   * @param size size of matrix
   * @param bandWidth width of band
   * @return matrix
   */
  public static BandMatrix<Z> create(final int size, final int bandWidth) {
    return new BandMatrix<>(size, bandWidth, Z.ZERO);
  }

  @SuppressWarnings("unchecked")
  private E[] init(final int length) {
    final E[] diagonal = (E[]) new Object[length];
    Arrays.fill(diagonal, mZero);
    return diagonal;
  }

  /**
   * Construct a square matrix with a given band size.
   * @param size number of rows
   * @param bandWidth width of band (must be odd)
   * @param zero the zero
   */
  @SuppressWarnings("unchecked")
  public BandMatrix(final int size, final int bandWidth, final E zero) {
    if ((bandWidth & 1) != 1) {
      throw new IllegalArgumentException("Band width must be odd");
    }
    mRows = size;
    mBandWidth = bandWidth;
    mZero = zero;
    mData = (E[][]) new Object[mBandWidth][];
    mMid = (mBandWidth - 1) / 2;
    for (int k = 0; k < mMid; ++k) {
      mData[mMid + k] = init(mBandWidth - 2 * k);
      if (k != 0) {
        mData[mMid - k] = init(mBandWidth - 2 * k);
      }
    }
  }

  @Override
  public E get(final long row, final long col) {
    final long delta = row - col;
    if (Math.abs(delta) >= mBandWidth) {
      return mZero; // outside band
    }
    return mData[(int) (mMid + delta)][(int) (col - delta)];
  }

  @Override
  public void set(final long row, final long col, final E element) {
    final long delta = row - col;
    if (Math.abs(delta) >= mBandWidth) {
      if (mZero.equals(element)) {
        return; // ok, attempt to set a zero off the band
      }
      throw new IllegalArgumentException("Attempt to set element to non-zero off band");
    }
    mData[(int) (mMid + delta)][(int) (col - delta)] = element;
  }

  @Override
  public long rows() {
    return mRows;
  }

  @Override
  public long cols() {
    return mRows;
  }

  @Override
  public boolean isDiagonal() {
    if (mBandWidth == 1) {
      return true; // Trivially diagonal
    }
    // todo check other elements
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUpperTriangular() {
    if (mBandWidth == 1) {
      return true;
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isLowerTriangular() {
    if (mBandWidth == 1) {
      return true;
    }
    throw new UnsupportedOperationException();
  }
}
