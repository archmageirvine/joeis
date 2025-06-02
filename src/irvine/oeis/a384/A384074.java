package irvine.oeis.a384;

import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384074 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384074 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Z.valueOf(2 * ((k + j) % mN) + 1));
      }
    }
    return new MatrixRing<>(mN, Integers.SINGLETON).permanent(m);
  }
}
