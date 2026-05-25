package irvine.oeis.a085;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A085000 Maximal determinant of an n X n matrix using the integers 1 to n^2.
 * @author Sean A. Irvine
 */
public class A085000 extends Sequence1 {

  // Only good for 3 terms

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Z> fld = new MatrixField<>(++mN, IntegerField.SINGLETON);
    final DefaultMatrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    final Permutation perm = new Permutation(mN * mN - 1);
    m.set(0, 0, Z.valueOf(mN * mN)); // WLOG symmetry
    Z max = Z.ZERO;
    int[] p;
    while ((p = perm.next()) != null) {
      for (int k = 0, r = 0; r < mN; ++r) {
        for (int c = r == 0 ? 1 : 0; c < mN; ++c, ++k) {
          m.set(r, c, Z.valueOf(p[k] + 1));
        }
      }
      max = max.max(fld.det(m));
    }
    return max;
  }
}
