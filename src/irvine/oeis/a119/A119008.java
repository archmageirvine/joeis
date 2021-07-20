package irvine.oeis.a119;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A119008 Number of n X n real symmetric (0,1)-matrices with determinant = 1.
 * @author Sean A. Irvine
 */
public class A119008 implements Sequence {
  
  // This is a direct but expensive way of constructing this sequence.
  // It iterates over all symmetric matrices.

  private int mSize = 0;

  private static final class SymmetricMatrixIterator {
    
    private final Matrix<Z> mMat;
    
    private SymmetricMatrixIterator(final int size) {
      mMat = new DefaultMatrix<>(size, size, Z.ZERO);
    }

    private Matrix<Z> next() {
      for (int r = 0; r < mMat.rows(); ++r) {
        for (int c = 0; c <= r; ++c) {
          final Z current = mMat.get(r, c);
          if (Z.ZERO == current) { // We control entries so == is ok
            mMat.set(r, c, Z.ONE);
            mMat.set(c, r, Z.ONE); // Symmetry
            return mMat;
          } else {
            mMat.set(r, c, Z.ZERO);
            mMat.set(c, r, Z.ZERO); // Symmetry
          }
        }
      }
      return null;
    }
  }

  @Override
  public Z next() {
    final MatrixField<Z> embed = new MatrixField<>(++mSize, IntegerField.SINGLETON);
    final SymmetricMatrixIterator it = new SymmetricMatrixIterator(mSize);
    long c = 0;
    Matrix<Z> mat;
    while ((mat = it.next()) != null) {
      if (embed.det(mat).equals(Z.ONE)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

