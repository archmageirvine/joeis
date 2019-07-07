package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024356 Determinant of Hankel matrix of the first <code>2n-1</code> prime numbers.
 * @author Sean A. Irvine
 */
public class A024356 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final MatrixRing<Z> m = new MatrixRing<>(mN, Integers.SINGLETON);
    final Matrix<Z> mat = new DefaultMatrix<Z>(mN, mN, Z.ZERO);
    for (long y = 0, p = 2; y < mN; ++y, p = mPrime.nextPrime(p)) {
      for (long x = 0, q = p; x < mN; ++x, q = mPrime.nextPrime(q)) {
        mat.set(x, y, Z.valueOf(q));
      }
    }
    return m.det(mat);
  }
}
