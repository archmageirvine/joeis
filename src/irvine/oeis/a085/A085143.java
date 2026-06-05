package irvine.oeis.a085;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007440;

/**
 * A085143 Triangle table from number wall of reversion of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A085143 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final DirectSequence mF = DirectSequence.create(new A007440());

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final DefaultMatrix<Z> mat = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        final int i = k + j + 1 + mM - mN;
        if (i > 0) {
          mat.set(k, j, mF.a(i));
        }
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(mat);
  }
}
