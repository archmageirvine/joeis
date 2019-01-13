package irvine.math.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

import irvine.math.api.Group;
import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.matrix.ZeroMatrix;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * A matrix group where individuals elements are drawn from a group.
 * @author Sean A. Irvine
 * @param <E> underlying type of matrix elements
 */
public class MatrixGroup<E> extends AbstractGroup<Matrix<E>> {

  private final long mRows;
  private final long mCols;
  private final Group<E> mElementGroup;
  protected final E mZero;

  /*
   * Compute a particular zero matrix for this group.  By detecting this zero
   * in various computations we can speed up certain operations.  Checking
   * should be done via the <code>zero()</code> method.
   */
  private final Matrix<E> mZeroMatrix;

  /**
   * Construct a new matrix group for matrices of a specified size.
   *
   * @param rows number of rows
   * @param cols number of columns
   * @param elementGroup group of underlying elements
   */
  public MatrixGroup(final long rows, final long cols, final Group<E> elementGroup) {
    mRows = rows;
    mCols = cols;
    mElementGroup = elementGroup;
    mZero = mElementGroup.zero();
    mZeroMatrix = new ZeroMatrix<>(mRows, mCols, mZero);
  }

  @Override
  public Matrix<E> zero() {
    return mZeroMatrix;
  }

  @Override
  public Matrix<E> add(final Matrix<E> a, final Matrix<E> b) {
    if (a == null || b == null) {
      throw new NullPointerException();
    }
    if (a == zero()) {
      return b;
    }
    if (b == zero()) {
      return a;
    }
    final Matrix<E> sum = new DefaultMatrix<>(mRows, mCols, mZero);
    for (long r = 0; r < mRows; ++r) {
      for (long c = 0; c < mCols; ++c) {
        sum.set(r, c, mElementGroup.add(a.get(r, c), b.get(r, c)));
      }
    }
    return sum;
  }

  @Override
  public Matrix<E> subtract(final Matrix<E> a, final Matrix<E> b) {
    if (a == null || b == null) {
      throw new NullPointerException();
    }
    if (b == zero()) {
      return a;
    }
    if (a == zero()) {
      return negate(b);
    }
    final Matrix<E> sum = new DefaultMatrix<>(mRows, mCols, mZero);
    for (long r = 0; r < mRows; ++r) {
      for (long c = 0; c < mCols; ++c) {
        sum.set(r, c, mElementGroup.subtract(a.get(r, c), b.get(r, c)));
      }
    }
    return sum;
  }

  @Override
  public Matrix<E> negate(final Matrix<E> matrix) {
    if (matrix == zero()) {
      return matrix;
    }
    final Matrix<E> negation = new DefaultMatrix<>(mRows, mCols, mZero);
    for (long r = 0; r < mRows; ++r) {
      for (long c = 0; c < mCols; ++c) {
        negation.set(r, c, mElementGroup.negate(matrix.get(r, c)));
      }
    }
    return negation;
  }

  @Override
  public Z size() {
    final Z elementSize = mElementGroup.size();
    if (elementSize == null) {
      return null;
    }
    return elementSize.pow(Z.valueOf(rows()).multiply(cols()));
  }

  @Override
  public boolean contains(final Matrix<E> element) {
    return element != null;
  }

  @Override
  public boolean isAbelian() {
    return mElementGroup.isAbelian();
  }

  @Override
  public String toString() {
    return "M_{" + rows() + "," + cols() + "}(" + mElementGroup + ")";
  }

  private static final class MatrixIterator<E> extends AbstractIterator<Matrix<E>> {

    private final Group<E> mUnder;
    private final ArrayList<ArrayList<Iterator<E>>> mUnderIt = new ArrayList<>();
    private final Matrix<E> mN;
    private boolean mFirst = true;

    /*
     * Iterate over all possible matrices.  This will be infinite in the case
     * where the underlying field has an infinite number of elements, but
     * if the underlying field is finite we will eventually exhaust all possible
     * matrices.
     */
    private MatrixIterator(final long rows, final long cols, final Group<E> under) {
      mUnder = under;
      mN = new DefaultMatrix<>(rows, cols, under.zero());
      for (long row = 0; row < rows; ++row) {
        final ArrayList<Iterator<E>> r = new ArrayList<>();
        mUnderIt.add(r);
        for (long col = 0; col < cols; ++col) {
          r.add(newIterator());
        }
      }
    }

    private Iterator<E> newIterator() {
      final Iterator<E> it = mUnder.iterator();
      it.next(); // step past the zero
      return it;
    }

    @Override
    public boolean hasNext() {
      if (mFirst) {
        return true;
      }
      for (final ArrayList<Iterator<E>> l : mUnderIt) {
        for (final Iterator<E> it : l) {
          if (it.hasNext()) {
            return true;
          }
        }
      }
      return false;
    }

    @Override
    public Matrix<E> next() {
      if (mFirst) {
        mFirst = false;
        return new DefaultMatrix<>(mN, mUnder.zero());
      }
      for (int row = mUnderIt.size() - 1; row >= 0; --row) {
        final ArrayList<Iterator<E>> rowList = mUnderIt.get(row);
        for (int col = rowList.size() - 1; col >= 0; --col) {
          final Iterator<E> iterator = rowList.get(col);
          if (iterator.hasNext()) {
            mN.set(row, col, iterator.next());
            return new DefaultMatrix<>(mN, mUnder.zero());
          } else {
            mN.set(row, col, mUnder.zero());
            rowList.set(col, newIterator());
          }
        }
      }
      throw new NoSuchElementException();
    }
  }

  @Override
  public Iterator<Matrix<E>> iterator() {
    return new MatrixIterator<>(rows(), cols(), mElementGroup);
  }

  /**
   * Number of rows in the matrix.
   * @return number of rows
   */
  public long rows() {
    return mRows;
  }

  /**
   * Number of columns in the matrix.
   * @return number of columns
   */
  public long cols() {
    return mCols;
  }

  /**
   * The sum of the elements on the main diagonal.
   * @param matrix the matrix
   * @return trace
   * @throws IllegalArgumentException if the matrix is not square.
   */
  public E trace(final Matrix<E> matrix) {
    if (rows() != cols()) {
      throw new IllegalArgumentException();
    }
    E s = mZero;
    if (matrix != zero()) {
      for (long k = 0; k < rows(); ++k) {
        s = mElementGroup.add(s, matrix.get(k, k));
      }
    }
    return s;
  }

  /**
   * Test if a matrix is symmetric.
   * @param matrix the matrix
   * @return true iff the matrix is symmetric
   */
  public boolean isSymmetric(final Matrix<E> matrix) {
    return matrix.equals(matrix.transpose());
  }

  /**
   * Test if a matrix is skew-symmetric. That is, <code>matrix^T=-matrix</code>.
   * @param matrix the matrix
   * @return true iff the matrix is skew-symmetric
   */
  public boolean isSkewSymmetric(final Matrix<E> matrix) {
    final long r = matrix.rows();
    if (r != matrix.cols()) {
      return false;
    }
    for (long k = 0; k < r; ++k) {
      for (long j = 0; j <= k; ++j) {
        if (!matrix.get(k, j).equals(mElementGroup.negate(matrix.get(j, k)))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Matrix<E> random(final Random random) {
    final Matrix<E> randomMatrix = new DefaultMatrix<>(mRows, mCols, mZero);
    for (int row = 0; row < mRows; ++row) {
      for (int col = 0; col < mCols; ++col) {
        randomMatrix.set(row, col, mElementGroup.random(random));
      }
    }
    return randomMatrix;
  }
}
