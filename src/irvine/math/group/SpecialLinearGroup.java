package irvine.math.group;

import java.util.Iterator;
import java.util.NoSuchElementException;

import irvine.math.api.Field;
import irvine.math.api.Matrix;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * The special linear group over a given ring.  That is, the group of
 * determinant 1 matrices of given size with respect to matrix multiplication.
 * @author Sean A. Irvine
 * @param <E> underlying type of matrix elements
 */
public class SpecialLinearGroup<E> extends GeneralLinearGroup<E> {

  /*
   * Mostly this is implemented by proxying the calls through to a more
   * general matrix ring.  Thus add in the general linear group
   * corresponds to a multiply in the matrix ring of the same size.
   */
  private final E mOne;

  /**
   * Construct a new special linear group for matrices of a specified size.
   *
   * @param size number of rows and columns
   * @param elementField field of underlying elements
   */
  public SpecialLinearGroup(final int size, final Field<E> elementField) {
    super(size, elementField);
    mOne = elementField.one();
  }

  @Override
  public Z size() {
    final Z size = super.size();
    return size == null ? null : size.divide(mElementField.size().subtract(1));
  }

  @Override
  public boolean contains(final Matrix<E> element) {
    return element != null && mOne.equals(mMatrixRing.det(element));
  }

  @Override
  public String toString() {
    return "SL_{" + mSize + "}(" + mElementField + ")";
  }

  private static final class SpecialLinearIterator<E> extends AbstractIterator<Matrix<E>> {

    private final E mOne;
    private final MatrixRing<E> mMatrixRing;
    private final Iterator<Matrix<E>> mMatrixIterator;
    private Matrix<E> mNext = null;

    private SpecialLinearIterator(final E one, final MatrixRing<E> ring) {
      mOne = one;
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
        if (mOne.equals(mMatrixRing.det(m))) {
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
    return new SpecialLinearIterator<>(mOne, mMatrixRing);
  }

}
