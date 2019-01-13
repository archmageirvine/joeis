package irvine.oeis.a003;

import irvine.math.api.Matrix;
import irvine.math.c.C;
import irvine.math.c.ComplexField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003112.
 * @author Sean A. Irvine
 */
public class A003112 implements Sequence {

  // This implementation is slow and might eventually lose accuracy. It is correct for at least n <= 12

  private static final C TAU_I = new C(0, Constants.TAU);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final C epsilon = ComplexField.SINGLETON.exp(ComplexField.SINGLETON.divide(TAU_I, new C(mN)));
    final MatrixRing<C> schurRing = new MatrixRing<>(mN, ComplexField.SINGLETON);
    final Matrix<C> schur = new DefaultMatrix<>(mN, mN, C.ZERO);
    for (int x = 0; x < mN; ++x) {
      for (int y = 0; y <= x; ++y) {
        final C e = ComplexField.SINGLETON.pow(epsilon, (x * y) % mN);
        schur.set(x, y, e);
        if (x != y) {
          schur.set(y, x, e);
        }
      }
    }
    final C perm = schurRing.permanent(schur);
    //System.out.println(mN + " " + perm);
    return Z.valueOf(Math.round(perm.re()));
  }
}
