package irvine.math.group;

import irvine.math.LongUtils;
import irvine.math.api.Matrix;
import irvine.math.api.Operation;
import irvine.math.api.Ring;
import irvine.math.api.Set;
import irvine.math.matrix.ConjugateMatrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.matrix.IdentityMatrix;
import irvine.math.matrix.MinorMatrix;
import irvine.math.matrix.Singular;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.util.Permutation;

/**
 * A matrix where individuals elements are drawn from a ring.
 * @author Sean A. Irvine
 * @param <E> underlying type of matrix elements
 */
public class MatrixRing<E> extends MatrixGroupRing<E> implements Ring<Matrix<E>> {

  /*
   * Compute a particular identity matrix for this group.  By detecting this one
   * in various computations we can speed up certain operations.  Checking
   * should be done via the <code>one()</code> method.
   */
  private final Matrix<E> mIdentity;

  /**
   * Construct a new matrix ring for matrices of a specified size.
   *
   * @param size number of rows
   * @param elementRing ring of underlying elements
   */
  public MatrixRing(final long size, final Ring<E> elementRing) {
    super(size, size, elementRing);
    mIdentity = new IdentityMatrix<>(size, mZero, mOne);
  }

  @Override
  public Matrix<E> one() {
    return mIdentity;
  }

  @Override
  public boolean isCommutative() {
    return rows() <= 1 && mElementRing.isCommutative();
  }

  @Override
  public boolean isIntegralDomain() {
    return rows() == 1 && mElementRing.isIntegralDomain();
  }

  @Override
  public Matrix<E> isZeroDivisor(final Matrix<E> matrix) {
    return AbstractRing.isZeroDivisor(this, matrix);
  }

  @Override
  public Matrix<E> multiply(final Matrix<E> a, final Matrix<E> b) {
    // Somewhat relaxed, this just requires the result of the product fits into the field
    final long size = rows();
    if (a.cols() != size || b.rows() != size) {
      throw new IllegalArgumentException("(" + a.rows() + "," + a.cols() + ")x(" + b.rows() + "," + b.cols() + ") cf. " + rows());
    }
    if (a == one()) {
      return b;
    }
    if (b == one()) {
      return a;
    }
    return super.multiply(a, b);
  }

  @Override
  public Matrix<E> pow(final Matrix<E> a, final long n) {
    if (a.isDiagonal()) {
      // Powers in diagonal matrices are powers of elements on the diagonal
      final Matrix<E> res = new DefaultMatrix<>(rows(), rows(), mZero);
      for (long k = 0; k < rows(); ++k) {
        res.set(k, k, mElementRing.pow(a.get(k, k), n));
      }
      return res;
    } else {
      return AbstractRing.pow(this, a, n);
    }
  }

  /**
   * Test if the given matrix is singular.
   * @param m matrix to test
   * @return true iff the matrix is singular.
   */
  public boolean isSingular(final Matrix<E> m) {
    return Singular.isSingular(m, mElementRing);
  }

  /**
   * Determinant.
   * @param m matrix
   * @return determinant of matrix
   */
  public E det(final Matrix<E> m) {
    // Strictly speaking this function should be restricted to matrix of
    // the same size as the group.  But because we can and it is helpful
    // for recursive expansion of cofactors this does work for any size.
    if (m == zero()) {
      return mZero;
    }
    if (m == one()) {
      return mOne;
    }
    final long size = m.rows();
    // Need this condition on MinorMatrix because it doesn't support
    // isDiagonal().  This is reasonable, because we are only likely to
    // encounter minor matrices in recursive calls to det.
    if (!(m instanceof MinorMatrix) && (m.isUpperTriangular() || m.isLowerTriangular())) {
      E det = mOne;
      for (long k = 0; k < size && !mZero.equals(det); ++k) {
        det = mElementRing.multiply(det, m.get(k, k));
      }
      return det;
    }
    if (size <= 3) {
      if (size == 1) {
        return m.get(0, 0);
      } else if (size == 2) {
        final E ad = mElementRing.multiply(m.get(0, 0), m.get(1, 1));
        final E bc = mElementRing.multiply(m.get(0, 1), m.get(1, 0));
        return mElementRing.subtract(ad, bc);
      } else {
        assert size == 3;
        // | a b c |
        // | d e f | = aei + bfg + cdh - ceg - bdi - afh
        // | g h i |
        final E a = m.get(0, 0);
        final E b = m.get(0, 1);
        final E c = m.get(0, 2);
        final E d = m.get(1, 0);
        final E e = m.get(1, 1);
        final E f = m.get(1, 2);
        final E g = m.get(2, 0);
        final E h = m.get(2, 1);
        final E i = m.get(2, 2);
        final E aei = mElementRing.multiply(mElementRing.multiply(a, e), i);
        final E bfg = mElementRing.multiply(mElementRing.multiply(b, f), g);
        final E cdh = mElementRing.multiply(mElementRing.multiply(c, d), h);
        final E ceg = mElementRing.multiply(mElementRing.multiply(c, e), g);
        final E bdi = mElementRing.multiply(mElementRing.multiply(b, d), i);
        final E afh = mElementRing.multiply(mElementRing.multiply(a, f), h);
        final E j = mElementRing.add(mElementRing.add(aei, bfg), cdh);
        final E k = mElementRing.add(mElementRing.add(ceg, bdi), afh);
        return mElementRing.add(j, mElementRing.negate(k));
      }
    }
    // We are going to do cofactor expansion along a row of columns.
    // We can't do Gaussian elimination since we are doing this in a ring
    // and so cannot take inverses.
    // Find the row or column with the most zeros, since this will be
    // quicker to evaluate, and indeed if we get an entire row or column
    // of zeros, then the determinant is zero.
    long bestRow = 0;
    long bestRowZeroCount = -1;
    for (long r = 0; r < size; ++r) {
      long count = 0;
      for (long c = 0; c < size; ++c) {
        if (mZero.equals(m.get(r, c))) {
          ++count;
        }
      }
      if (count > bestRowZeroCount) {
        bestRowZeroCount = count;
        bestRow = r;
      }
      if (count == size) {
        return mZero;
      }
    }
    long bestCol = 0;
    long bestColZeroCount = -1;
    for (long c = 0; c < size; ++c) {
      long count = 0;
      for (long r = 0; r < size; ++r) {
        if (mZero.equals(m.get(r, c))) {
          ++count;
        }
      }
      if (count > bestColZeroCount) {
        bestColZeroCount = count;
        bestCol = c;
      }
      if (count == size) {
        return mZero;
      }
    }
    E det = mZero;
    if (bestColZeroCount > bestRowZeroCount) {
      // Cofactor expansion down column bestCol
      for (long r = 0; r < size; ++r) {
        final E a = m.get(r, bestCol);
        if (!mZero.equals(a)) {
          E minor = det(m.delete(r, bestCol));
          if (((bestCol + r) & 1) == 1) {
            minor = mElementRing.negate(minor);
          }
          det = mElementRing.add(det, mElementRing.multiply(a, minor));
        }
      }
    } else {
      // Cofactor expansion along row bestRow
      for (long c = 0; c < size; ++c) {
        final E a = m.get(bestRow, c);
        if (!mZero.equals(a)) {
          E minor = det(m.delete(bestRow, c));
          if (((bestRow + c) & 1) == 1) {
            minor = mElementRing.negate(minor);
          }
          det = mElementRing.add(det, mElementRing.multiply(a, minor));
        }
      }
    }
    return det;
  }

  /**
   * Permanent.
   * @param m matrix
   * @return permanent of the matrix
   */
  public E permanent(final Matrix<E> m) {
    if (m.rows() > m.cols()) {
      return permanent(m.transpose()); // transpose does not change value of permanent
    }
    if (zero().equals(m)) {
      return mZero;
    }
    if (one().equals(m)) {
      return mOne;
    }
    final long r = m.rows();
    if (r > Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    switch ((int) r) {
    case 0:
      return mZero;
    case 1:
      E sumRow = mZero;
      for (int k = 0; k < m.cols(); ++k) {
        sumRow = mElementRing.add(sumRow, m.get(0, k));
      }
      return sumRow;
    default:
      E sum = mZero;
      for (long select = (1L << m.rows()) - 1; select < 1L << m.cols(); select = LongUtils.swizzle(select)) {
        final int[] cols = new int[(int) m.rows()];
        long s = select;
        for (int k = 0, j = 0; k < cols.length; ++k) {
          while ((s & 1) == 0) {
            ++j;
            s >>>= 1;
          }
          cols[k] = j;
          s >>>= 1;
          ++j;
        }
        final Permutation p = new Permutation(cols);
        int[] sigma;
        while ((sigma = p.next()) != null) {
          E w = mOne;
          for (int k = 0; k < m.rows(); ++k) {
            w = mElementRing.multiply(w, m.get(k, sigma[k]));
            if (mZero.equals(w)) {
              break;
            }
          }
          sum = mElementRing.add(sum, w);
        }
      }
      return sum;
    }
  }

  /**
   * Return the characteristic polynomial of a matrix.
   * @param m matrix
   * @return characteristic polynomial
   */
  public Polynomial<E> characteristicPolynomial(final Matrix<E> m) {
    final PolynomialRing<E> poly = new PolynomialRing<>(mElementRing);
    final Matrix<Polynomial<E>> lambda = new DefaultMatrix<>(m.rows(), m.cols(), poly.zero());
    for (long row = 0; row < m.rows(); ++row) {
      for (long col = 0; col < m.cols(); ++col) {
        final Polynomial<E> p = new Polynomial<>("x", mZero, mOne);
        p.add(mElementRing.negate(m.get(row, col))); // Add constant term
        if (row == col) {
          p.add(mOne); // Add "x"
        }
        p.fixDegree();
        lambda.set(row, col, p);
      }
    }
    return new MatrixRing<>(m.rows(), poly).det(lambda);
  }

  /**
   * The adjugate matrix of the given matrix.
   * @param m matrix
   * @return the adjugate matrix
   */
  public Matrix<E> adjugate(final Matrix<E> m) {
    // This could presumably be made faster in special cases
    final Matrix<E> adj = new DefaultMatrix<>(m.cols(), m.rows(), mZero);
    for (long row = 0; row < m.rows(); ++row) {
      for (long col = 0; col < m.cols(); ++col) {
        final E det = det(m.delete(row, col));
        adj.set(col, row, ((row + col) & 1) == 0 ? det : mElementRing.negate(det));
      }
    }
    return adj;
  }

  @Override
  public Z ord(final Matrix<E> element) {
    Z order = Z.ZERO;
    Matrix<E> v = one();
    do {
      order = order.add(1);
      v = multiply(v, element);
    } while (!multiply(v, v).equals(v));
    return order;
  }

  @Override
  public Z characteristic() {
    return AbstractRing.characteristic(this);
  }

  @Override
  public boolean isSubring(final Set<Matrix<E>> elements) {
    return AbstractRing.isSubring(this, elements);
  }

  @Override
  public boolean isIdeal(final Set<Matrix<E>> elements) {
    return AbstractRing.isIdeal(this, elements);
  }

  @Override
  public Ring<Matrix<E>> ideal(final Matrix<E> element) {
    return new FiniteIdeal<>(this, element);
  }

  @Override
  public Ring<Set<Matrix<E>>> quotientRing(final Ring<Matrix<E>> ideal) {
    return new QuotientRing<>(this, ideal);
  }

  @Override
  public Operation<Matrix<E>> multiplicativeOperation() {
    return new RingBackedOperation<>(this);
  }

  @Override
  public Matrix<E> conjugate(final Matrix<E> matrix) {
    return new ConjugateMatrix<>(mElementRing, matrix);
  }

  /**
   * Construct the adjoint of a matrix.
   * @param matrix the matrix
   * @return the adjoint matrix
   */
  public Matrix<E> adjoint(final Matrix<E> matrix) {
    return conjugate(transpose(matrix));
  }

  /**
   * Test if the matrix is unitary.
   * @param matrix matrix to test
   * @return true iff the matrix is unitary
   */
  public boolean isUnitary(final Matrix<E> matrix) {
    return one().equals(multiply(adjoint(matrix), matrix));
  }
}
