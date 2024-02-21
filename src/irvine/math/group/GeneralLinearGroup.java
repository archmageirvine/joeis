package irvine.math.group;

import java.util.Iterator;
import java.util.NoSuchElementException;

import irvine.math.api.Matrix;
import irvine.math.api.Ring;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * The general linear group over a given ring.  That is, the group of
 * invertible matrices of given size with respect to matrix multiplication.
 * @author Sean A. Irvine
 * @param <E> underlying type of matrix elements
 */
public class GeneralLinearGroup<E> extends AbstractGroup<Matrix<E>> {

  /*
   * Mostly this is implemented by proxying the calls through to a more
   * general matrix ring.  Thus add in the general linear group
   * corresponds to a multiply in the matrix ring of the same size.
   */

  protected final int mSize;
  protected final Ring<E> mElementRing;
  protected final MatrixRing<E> mMatrixRing;
  protected final E mZero;

  /*
   * Actually an identity matrix because operation is multiplication.
   */
  private final Matrix<E> mZeroMatrix;

  /**
   * Construct a new general linear group for matrices of a specified size.
   * @param size number of rows and columns
   * @param elementRing ring of underlying elements
   */
  public GeneralLinearGroup(final int size, final Ring<E> elementRing) {
    mSize = size;
    mElementRing = elementRing;
    mZero = mElementRing.zero();
    mMatrixRing = new MatrixRing<>(size, elementRing);
    mZeroMatrix = mMatrixRing.one();
  }

  @Override
  public Matrix<E> zero() {
    return mZeroMatrix;
  }

  @Override
  public Matrix<E> add(final Matrix<E> a, final Matrix<E> b) {
    mMatrixRing.checkContains(a);
    mMatrixRing.checkContains(b);
    return mMatrixRing.multiply(a, b);
  }

  @Override
  public Matrix<E> negate(final Matrix<E> matrix) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Z size() {
    // There is a theorem that says if the underlying field is infinite,
    // then so is the general linear group.
    final Z q = mElementRing.size();
    if (q == null) {
      return null;
    }
    // Otherwise, it is prod_{k=0}^{n-1}(q^n-q^k) where q is field size
    Z s = Z.ONE;
    final int n = mSize;
    final Z qn = q.pow(n);
    Z p = Z.ONE;
    for (int k = 0; k < n; ++k) {
      s = s.multiply(qn.subtract(p));
      p = p.multiply(q);
    }
    return s;
  }

  @Override
  public boolean contains(final Matrix<E> element) {
    return element != null && !mZero.equals(mMatrixRing.det(element));
  }

  @Override
  public boolean isAbelian() {
    return mSize < 2;
  }

  @Override
  public String toString() {
    return "GL_{" + mSize + "}(" + mElementRing + ")";
  }

  private static final class GeneralLinearIterator<E> extends AbstractIterator<Matrix<E>> {

    private final E mZero;
    private final MatrixRing<E> mMatrixRing;
    private final Iterator<Matrix<E>> mMatrixIterator;
    private Matrix<E> mNext = null;

    private GeneralLinearIterator(final E zero, final MatrixRing<E> ring) {
      mZero = zero;
      mMatrixRing = ring;
      mMatrixIterator = ring.iterator();
    }

    @Override
    public boolean hasNext() {
      if (mNext != null) {
        return true;
      }
      while (mMatrixIterator.hasNext()) {
        final Matrix<E> m = mMatrixIterator.next();
        final E det = mMatrixRing.det(m);
        if (!mZero.equals(det)) {
          mNext = m;
          return true;
        }
      }
      return false;
    }

    @Override
    public Matrix<E> next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      final Matrix<E> m = mNext;
      mNext = null;
      return m;
    }
  }

  @Override
  public Iterator<Matrix<E>> iterator() {
    return new GeneralLinearIterator<>(mZero, mMatrixRing);
  }

  @Override
  public CycleIndex cycleIndex() {
    return GeneralLinearCycleIndex.cycleIndex(mSize, mElementRing);
  }
}
