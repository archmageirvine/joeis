package irvine.oeis.a056;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056204 Number of n X 5 binary matrices under row and column permutations and column complementations.
 * @author Sean A. Irvine
 */
public class A056204 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final long[] NUM = {1, 231, 20, 520, 60, 80, 720, 160, 320, 240, 480, 240, 384, 384};
  private static final int[][] DEN_A = {{1}, {2}, {1, 2}, {4}, {1, 2}, {1, 3}, {2, 6}, {1, 2, 3, 6},
    {4, 12}, {1, 2, 4}, {8}, {2, 4}, {1, 5}, {2, 10}};
  private static final int[][] DEN_B = {{32}, {16}, {16, 8}, {8}, {8, 12}, {8, 8}, {4, 4}, {4, 2, 4, 2},
    {2, 2}, {4, 2, 6}, {4}, {4, 6}, {2, 6}, {1, 3}};
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
    return sum.divide(3840);
  }
}
