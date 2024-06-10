package irvine.oeis.a070;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070322 Number of primitive n X n real (0,1)-matrices.
 * @author Sean A. Irvine
 */
public class A070322 extends Sequence0 {

  private int mN = -1;

  private Z getMin(final Matrix<Z> m) {
    Z min = m.get(0, 0);
    if (!min.isZero()) {
      for (long k = 0; k < m.rows(); ++k) {
        for (long j = 0; j < m.cols(); ++j) {
          final Z e = m.get(k, j);
          if (e.compareTo(min) < 0) {
            min = e;
            if (min.isZero()) {
              return Z.ZERO;
            }
          }
        }
      }
    }
    return min;
  }

  private boolean is(final MatrixRing<Z> ring, final Matrix<Z> m, final int n) {
    return !getMin(ring.pow(m, n)).isZero();
    // Mathematica seems to check every power, but that seems unnecessary
//    int k = 1;
//    Matrix<Z> mk = m;
//    do {
//      if (!getMin(mk).isZero()) {
//        return true;
//      }
//      mk = ring.multiply(mk, m);
//    } while (++k <= n);
//    return false;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long count = 0;
    final int lim = mN * mN + 2 * mN + 2;
    final MatrixRing<Z> ring = new MatrixRing<>(mN, Integers.SINGLETON);
    for (final Matrix<Z> m : new MatrixRing<>(mN, new IntegersMod(2))) { // Generate binary matrices
      if (is(ring, m, lim)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
