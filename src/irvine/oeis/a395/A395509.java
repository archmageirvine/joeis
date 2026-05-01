package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A395509 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A395509 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s0 = Functions.SIGMA0.l(++mN);
    final DefaultMatrix<Z> m = new DefaultMatrix<>(s0, s0, Z.ZERO);
    final long[] d = ZUtils.toLong(Jaguar.factor(mN).divisorsSorted());
    for (int r = 0; r < d.length; ++r) {
      for (int c = 0; c < d.length; ++c) {
        m.set(r, c, Functions.SIGMA1.z(d[r] * d[c]));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}
