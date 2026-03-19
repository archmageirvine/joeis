package irvine.oeis.a393;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393240 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A393240 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Matrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        m.set(k, j, Functions.FIBONACCI.z(k + j + 1));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}
