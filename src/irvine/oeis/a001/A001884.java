package irvine.oeis.a001;

import irvine.math.api.Matrix;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001884 Hit polynomials.
 * @author Sean A. Irvine
 */
public class A001884 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001884(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001884() {
    super(1);
  }

  protected int coeff() {
    return 1;
  }

  protected final DegreeLimitedPolynomialRingField<Z> mRing = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, coeff());

  private int mN = coeff() - 1;

  protected Matrix<Polynomial<Z>> a(final int n) {
    final Matrix<Polynomial<Z>> m = new DefaultMatrix<>(n, n, mRing.zero());
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        m.set(i, j, Math.abs(i - j) <= 1 ? mRing.x() : mRing.one());
      }
    }
    return m;
  }

  @Override
  public Z next() {
    final MatrixRing<Polynomial<Z>> ring = new MatrixRing<>(++mN, mRing);
    final Polynomial<Z> p = ring.permanent(a(mN));
    return p.coeff(coeff());
  }
}
