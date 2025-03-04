package irvine.oeis.a075;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075691 Let M(k) be the k X k matrix m_(i,j) = i (mod j) - j (mod i); then a(n) = det(M(2*n)).
 * @author Sean A. Irvine
 */
public class A075691 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Q.valueOf((k + 1) % (j + 1) - (j + 1) % (k + 1)));
      }
    }
    return new MatrixField<Q>(mN, Rationals.SINGLETON).det(m).toZ();
  }
}
