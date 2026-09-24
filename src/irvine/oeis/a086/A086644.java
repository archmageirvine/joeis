package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.group.SymmetricGroup;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000701;

/**
 * A086644 Permanent of the character table of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A086644 extends Sequence1 {

  private final Sequence mA = new A000701().skip();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mA.next().isOdd()) {
      return Z.ZERO;
    }
    final Matrix<Z> mat = new DefaultMatrix<>(SymmetricGroup.create(mN).characterTable(), Z.ZERO);
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(mat);
  }
}
