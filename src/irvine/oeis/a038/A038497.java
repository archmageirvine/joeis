package irvine.oeis.a038;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A038497 Matrix square of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A038497 extends A008284 {

  private final DefaultMatrix<Z> mA = new DefaultMatrix<>(0, 0, Z.ZERO);
  private Matrix<Z> mA2 = null;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mA.setRows(++mN);
      mA.setCols(mN);
      for (int k = 0; k < mN; ++k) {
        mA.set(mN - 1, k, super.next());
      }
      mA2 = new MatrixRing<>(mN, Integers.SINGLETON).multiply(mA, mA);
      mM = 0;
    }
    return mA2.get(mN - 1, mM);
  }
}
