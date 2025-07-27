package irvine.oeis.a078;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078994 Determinant of n X n matrix M(n) where m(i,i)=i if i&gt;j, m(i,j)=i-j if j&gt;i, m(i,j)=j-i.
 * @author Sean A. Irvine
 */
public class A078994 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        m.set(k, j, Z.valueOf(k == j ? k + 1 : Math.abs(k - j)));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(m);
  }
}
