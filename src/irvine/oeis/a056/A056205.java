package irvine.oeis.a056;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056205 Number of n X 6 binary matrices under row and column permutations and column complementations.
 * @author Sean A. Irvine
 */
public class A056205 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final long[] NUM = {1, 1053, 30, 4920, 180, 120, 160, 5280, 960, 3840, 640, 1920, 720, 5760,
    2160, 1440, 2304, 6912, 3840, 3840};
  private static final int[][] DEN_A = {{1}, {2}, {1, 2}, {4}, {1, 2}, {1, 2}, {1, 3}, {2, 6}, {1, 2, 3, 6},
    {4, 12}, {1, 3}, {2, 6}, {1, 2, 4}, {8}, {2, 4}, {1, 2, 4}, {1, 5}, {2, 10}, {1, 2, 3, 6}, {4, 12}};
  private static final int[][] DEN_B = {{64}, {32}, {32, 16}, {16}, {16, 24}, {8, 28}, {16, 16}, {8, 8}, {8, 4, 8, 4},
    {4, 4}, {4, 20}, {2, 10}, {8, 4, 12}, {8}, {8, 12}, {4, 6, 12}, {4, 12}, {2, 6}, {2, 1, 2, 9}, {1, 5}};
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < NUM.length; ++k) {
      Polynomial<Z> den = RING.one();
      for (int j = 0; j < DEN_A[k].length; ++j) {
        den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(DEN_A[k][j]), DEN_B[k][j], mN), mN);
      }
      sum = sum.add(RING.coeff(RING.one(), den, mN).multiply(NUM[k]));
    }
    return sum.divide(46080);
  }
}
