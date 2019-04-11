package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005353 Number of 2 X 2 matrices with entries <code>mod n</code> and nonzero determinant.
 * @author Sean A. Irvine
 */
public class A005353 implements Sequence {

  private final Fast mP = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mP.isPrime(mN)) {
      return Z.valueOf(mN).square().subtract(1).multiply(mN - 1).multiply(mN);
    }
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(mN));
    long c = 0;
    for (final Matrix<Z> mat : ring) {
      if (!Z.ZERO.equals(ring.det(mat))) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
