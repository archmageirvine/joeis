package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.group.SymmetricGroup;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085800.
 * @author Sean A. Irvine
 */
public class A086644 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Matrix<Z> mat = new DefaultMatrix<>(SymmetricGroup.create(mN).characterTable(), Z.ZERO);
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(mat);
  }
}
