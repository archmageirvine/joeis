package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085905 Permanent of the symmetric n X n matrix M defined by M(i,j) = lcm(i,j) for 1 &lt;= i,j &lt;= n.
 * @author Sean A. Irvine
 */
public class A085905 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Functions.LCM.z(k + 1, j + 1));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}
