package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067276 Determinant of n X n matrix containing the first n^2 primes in increasing order.
 * @author Sean A. Irvine
 */
public class A067276 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    long p = 1;
    for (long y = 0; y < mN; ++y) {
      for (long x = 0; x < mN; ++x) {
        p = mPrime.nextPrime(p);
        m.set(y, x, new Q(p));
      }
    }
    return fld.det(m).toZ();
  }
}
