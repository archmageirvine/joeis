package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A086243 Number of invertible (-1,0,1) n X n matrices having (Tij=-Tji; i&lt;j) such that all T^k (k= 1..12) are also (-1,0,1) invertible matrices having (Tij=-Tji; i&lt;j).
 * @author Sean A. Irvine
 */
public class A086243 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(-1, 1);
  private int mN = 0;

  private boolean is(final MatrixField<Z> fld, final Matrix<Z> m) {
    Matrix<Z> t = m;
    for (int k = 2; k <= 12; ++k) {
      t = fld.multiply(t, m);

      // Every entry must be -1, 0, or 1.
      for (int i = 0; i < m.rows(); ++i) {
        for (int j = 0; j < m.cols(); ++j) {
          if (t.get(i, j).abs().compareTo(Z.ONE) > 0) {
            return false;
          }
        }
      }

      // Off-diagonal part must be skew-symmetric.
      for (int i = 0; i < m.rows(); ++i) {
        for (int j = i + 1; j < m.cols(); ++j) {
          if (!t.get(i, j).equals(t.get(j, i).negate())) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final int[] v = new int[Functions.TRIANGULAR.i(mN)];
    Arrays.fill(v, -1);
    final MatrixField<Z> fld = new MatrixField<>(mN, IntegerField.SINGLETON);
    final DefaultMatrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    long count = 0;
    do {
      for (int i = 0, k = 0; i < mN; ++i) {
        for (int j = i; j < mN; ++j, ++k) {
          m.set(i, j, Z.valueOf(v[k]));
          if (i != j) {
            m.set(j, i, Z.valueOf(-v[k]));
          }
        }
      }
      if (!fld.det(m).isZero() && is(fld, m)) {
        //System.out.println(m);
        ++count;
      }
    } while (mBumper.bump(v));
    return Z.valueOf(count);
  }
}
