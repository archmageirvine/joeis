package irvine.oeis.a392;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392840 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A392840 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Matrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        if (j == k) {
          m.set(k, k, Functions.FIBONACCI.z(2 * k + 1).multiply(Functions.LUCAS.z(2 * (k + 1))));
        } else {
          m.set(k, j, Functions.FIBONACCI.z(2 * (k + 1)).multiply(Functions.LUCAS.z(2 * j + 1)));
        }
      }
    }
    final MatrixField<Z> ring = new MatrixField<>(mN, IntegerField.SINGLETON);
    return ring.permanent(m);
  }
}

