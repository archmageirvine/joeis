package irvine.oeis.a007;

import irvine.math.MemoryFunction1;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007777 Number of overlap-free binary words of length n.
 * @author Sean A. Irvine
 */
public class A007777 extends MemoryFunction1<Matrix<Z>> implements Sequence {

  // After Pab Ter

  private static final MatrixRing<Z> RING = new MatrixRing<>(4, Integers.SINGLETON);
  private static final Matrix<Z> DELTA = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ZERO, Z.ONE, Z.ONE},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO},
    {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO},
  }, Z.ZERO);
  private static final Matrix<Z> IOTA = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
  }, Z.ZERO);
  private static final Matrix<Z> KAPPA = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ZERO, Z.ONE, Z.ONE},
    {Z.ONE, Z.ONE, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
  }, Z.ZERO);
  private static final Matrix<Z> V5 = new DefaultMatrix<>(new Z[][] {
    {Z.TWO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
  }, Z.ZERO);
  private static final Matrix<Z> V7 = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ZERO, Z.TWO, Z.ZERO},
    {Z.ZERO, Z.TWO, Z.ZERO, Z.ZERO},
    {Z.TWO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO},
  }, Z.ZERO);
  private static final Matrix<Z> U4 = new DefaultMatrix<>(new Z[][] {
    {Z.TWO, Z.ZERO, Z.TWO, Z.ZERO},
    {Z.ZERO, Z.TWO, Z.ZERO, Z.ZERO},
    {Z.TWO, Z.ZERO, Z.ZERO, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ZERO, Z.TWO},
  }, Z.ZERO);
  private static final Matrix<Z> U5 = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.TWO, Z.TWO, Z.ZERO},
    {Z.TWO, Z.ZERO, Z.ZERO, Z.TWO},
    {Z.TWO, Z.ZERO, Z.TWO, Z.ZERO},
    {Z.ZERO, Z.TWO, Z.ZERO, Z.ZERO},
  }, Z.ZERO);
  private static final Matrix<Z> U6 = new DefaultMatrix<>(new Z[][] {
    {Z.TWO, Z.TWO, Z.ZERO, Z.TWO},
    {Z.TWO, Z.TWO, Z.TWO, Z.ZERO},
    {Z.ZERO, Z.TWO, Z.TWO, Z.ZERO},
    {Z.TWO, Z.ZERO, Z.ZERO, Z.TWO},
  }, Z.ZERO);
  private static final Matrix<Z> U7 = new DefaultMatrix<>(new Z[][] {
    {Z.FOUR, Z.TWO, Z.ZERO, Z.TWO},
    {Z.TWO, Z.ZERO, Z.TWO, Z.TWO},
    {Z.ZERO, Z.TWO, Z.ZERO, Z.TWO},
    {Z.TWO, Z.TWO, Z.TWO, Z.ZERO},
  }, Z.ZERO);
  private static final Matrix<Z> T_DELTA = DELTA.transpose();
  private static final Matrix<Z> T_IOTA = IOTA.transpose();
  private static final Matrix<Z> T_KAPPA = KAPPA.transpose();
  private static final Matrix<Z> K_PLUS_I = RING.add(KAPPA, IOTA);
  private static final Matrix<Z> T_K_PLUS_I = K_PLUS_I.transpose();
  private static final int[] SMALL = {1, 2, 4, 6};

  private static final class VFunction extends MemoryFunction1<Matrix<Z>> {

    @Override
    protected Matrix<Z> compute(final int n) {
      if (n > 7 && (n & 1) == 1) {
        return RING.add(RING.multiply(RING.multiply(KAPPA, get((n + 1) / 2)), T_DELTA),
          RING.multiply(RING.multiply(DELTA, get((n + 1) / 2)), T_KAPPA));
      } else if (n == 5) {
        return V5;
      } else if (n == 7) {
        return V7;
      } else {
        return RING.zero();
      }
    }
  }

  private final VFunction mV = new VFunction();
  private int mN = -1;

  // U function
  @Override
  protected Matrix<Z> compute(final int n) {
    if (n > 7) {
      if ((n & 1) == 1) {
        return RING.add(RING.add(RING.add(RING.multiply(RING.multiply(IOTA, mV.get((n + 1) / 2)), T_DELTA),
          RING.multiply(RING.multiply(DELTA, mV.get((n + 1) / 2)), T_IOTA)),
          RING.multiply(RING.multiply(K_PLUS_I, get((n + 1) / 2)), T_DELTA)),
          RING.multiply(RING.multiply(DELTA, get((n + 1) / 2)), T_K_PLUS_I));
      } else {
        return RING.add(RING.add(RING.add(RING.multiply(RING.multiply(IOTA, mV.get(n / 2)), T_IOTA),
          RING.multiply(RING.multiply(DELTA, mV.get(n / 2 + 1)), T_DELTA)),
          RING.multiply(RING.multiply(K_PLUS_I, get(n / 2)), T_K_PLUS_I)),
          RING.multiply(RING.multiply(DELTA, get(n / 2 + 1)), T_DELTA));
      }
    } else if (n == 4) {
      return U4;
    } else if (n == 5) {
      return U5;
    } else if (n == 6) {
      return U6;
    } else if (n == 7) {
      return U7;
    }
    return null;
  }

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    }
    final Matrix<Z> u = get(mN);
    Z sum = Z.ZERO;
    for (int y = 0; y < u.rows(); ++y) {
      for (int x = 0; x < u.cols(); ++x) {
        sum = sum.add(u.get(y, x));
      }
    }
    return sum;
  }
}
