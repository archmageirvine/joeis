package irvine.oeis.a392;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392523 allocated for Hyeonjun Ahn.
 * @author Sean A. Irvine
 */
public class A392523 extends Sequence1 {

  private static final MatrixRing<Z> RING = new MatrixRing<>(3, IntegerField.SINGLETON);
  private final Matrix<Z> mM = new DefaultMatrix<>(3, 3, Z.ZERO);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (int k = 0; k < 3; ++k) {
        for (int j = 0; j < 3; ++j) {
          mM.set(k, j, Functions.PRIME.z(mN + k + j));
        }
      }
      if (RING.det(mM).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
