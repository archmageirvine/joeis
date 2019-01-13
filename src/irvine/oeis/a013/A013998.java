package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013998.
 * @author Sean A. Irvine
 */
public class A013998 implements Sequence {

  private static final Matrix<Z> MATRIX = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ONE},
    {Z.ONE, Z.ONE, Z.ZERO}
  }, Z.ZERO);
  private final Fast mPrime = new Fast();
  private long mN = 271440;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final MatrixRing<Z> ring = new MatrixRing<>(3, new IntegersMod(mN));
        if (Z.ZERO.equals(ring.trace(ring.pow(MATRIX, mN)))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
