package irvine.oeis.a018;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018187 Restricted Perrin pseudoprimes.
 * @author Sean A. Irvine
 */
public class A018187 extends Sequence1 {

  // This is slow, cf. also A013998

  private static final Matrix<Z> A = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ONE},
    {Z.ONE, Z.ONE, Z.ZERO}
  }, Z.ZERO);

  private static final Matrix<Z> B = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ONE},
    {Z.ONE, Z.ZERO, Z.ZERO}
  }, Z.ZERO);

  private Z mN = Z.valueOf(27664031);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isPrime()) {
        final IntegersMod zn = new IntegersMod(mN);
        final MatrixRing<Z> ring = new MatrixRing<>(3, zn);
        if (ring.trace(ring.pow(A, mN.longValueExact())).isZero()) {
          final Z m = mN.subtract(1);
          B.set(2, 2, m);
          if (ring.trace(ring.pow(B, mN.longValueExact())).equals(m)) {
            return mN;
          }
        }
      }
    }
  }
}

