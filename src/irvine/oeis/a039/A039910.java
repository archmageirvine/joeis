package irvine.oeis.a039;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a008.A008459;

/**
 * A039910 Lower triangular matrix T = Pascal lower triangular matrix divided on the left by its entry-square.
 * @author Sean A. Irvine
 */
public class A039910 extends A008459 {

  private long mN = -1;
  private long mM = 0;
  private final DefaultMatrix<Q> mMatrix = new DefaultMatrix<>(0, 0, Q.ZERO);
  private final DefaultMatrix<Q> mBinomial = new DefaultMatrix<>(0, 0, Q.ZERO);
  private Matrix<Q> mA = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mMatrix.setRows(mN + 1);
      mMatrix.setCols(mN + 1);
      mBinomial.setRows(mN + 1);
      mBinomial.setCols(mN + 1);
      for (long k = 0; k <= mN; ++k) {
        mMatrix.set(mN, k, new Q(super.next()));
        mBinomial.set(mN, k, new Q(Binomial.binomial(mN, k)));
      }
      final MatrixField<Q> fld = new MatrixField<>(mN + 1, Rationals.SINGLETON);
      mA = fld.multiply(fld.inverse(mMatrix), mBinomial);
    }
    return mA.get(mN, mM).toZ();
  }
}
