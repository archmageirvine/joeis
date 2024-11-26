package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073364 Number of permutations p of (1,2,3,...,n) such that k+p(k) is prime for 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A073364 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Z> ring = new MatrixField<>(++mN, IntegerField.SINGLETON);
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        if (mPrime.isPrime(k + j + 2)) {
          m.set(k, j, Z.ONE);
        }
      }
    }
    return ring.permanent(m);
  }
}

