package irvine.oeis.a136;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A136493 Triangle of coefficients of characteristic polynomials of symmetrical pentadiagonal matrices of the type (1,-1,1,-1,1).
 * @author Sean A. Irvine
 */
public class A136493 extends Sequence0 {

  private final int mBandWidth;
  private int mN = -1;
  private Polynomial<Z> mCharPoly = Polynomial.create(0);
  private int mM = 0;

  protected A136493(final int bandWidth) {
    mBandWidth = bandWidth;
  }

  /** Construct the sequence. */
  public A136493() {
    this(5);
  }

  @Override
  public Z next() {
    if (mN < 0) {
      mN = 0;
      return Z.ONE;
    }
    if (--mM < 0) {

      // Construct a symmetric n-diagonal matrix with pattern 1, -1, 1, -1, 1, ...
      final MatrixRing<Z> ring = new MatrixRing<>(++mN, Integers.SINGLETON);
      final Matrix<Z> matrix = new DefaultMatrix<>(mN, mN, Z.ZERO);
      for (int k = 0; k <= mBandWidth / 2; ++k) {
        final Z t = (k & 1) == 0 ? Z.ONE : Z.NEG_ONE;
        for (int j = k; j < mN; ++j) {
          matrix.set(j - k, j, t);
          matrix.set(j, j - k, t);
        }
      }
      //System.out.println(matrix);

      // Compute the characteristic polynomial of the matrix
      mCharPoly = ring.characteristicPolynomial(matrix);
      //System.out.println(mCharPoly);
      mM = mCharPoly.degree();
    }
    return mCharPoly.coeff(mM).multiply((mN & 1) == 1 ? -1 : 1);
  }
}
