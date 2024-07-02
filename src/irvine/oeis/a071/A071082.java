package irvine.oeis.a071;

import irvine.factor.prime.Puma;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A071082 Determinant of the n X n matrix whose element (i,j) equals the (i-j)-th composite number, (j-i)-th prime number, or 1 if i=j.
 * @author Sean A. Irvine
 */
public class A071082 extends Sequence1 {

  private final DirectSequence mComposites = DirectSequence.create(new A002808());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final MatrixField<Q> field = new MatrixField<>(mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        if (k == j) {
          mat.set(k, j, Q.ONE);
        } else if (k < j) {
          mat.set(k, j, new Q(mComposites.a(j - k)));
        } else {
          mat.set(k, j, new Q(Puma.prime(k - j)));
        }
      }
    }
    return field.det(mat).toZ();
  }
}

