package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A032428 Coefficients of Jacobi elliptic function c(5,m).
 * @author Sean A. Irvine
 */
public class A032428 extends MemoryFunctionInt3Sequence<Z> {

  // Based on (2) in Dominique Dumont
  // A Combinatorial Interpretation for the Schett Recurrence on the Jacobian Elliptic Functions

  private int mN = j() - 1;

  @Override
  protected Z compute(final int m, final int i, final int j) {
    if (m == 1 && i == 0 && j == 0) {
      return Z.ONE;
    }
    if (i + j < 0 || i + j > m / 2) {
      return Z.ZERO;
    }
    if ((m & 1) == 0) {
      return get(m - 1, i, j).multiply(2 * j + 1)
        .add(get(m - 1, i + 1, j - 1).multiply(2 * i + 2))
        .add(get(m - 1, i, j - 1).multiply(m - 2 * i - 2 * j + 1));
    } else {
      return get(m - 1, i, j).multiply(2 * i + 1)
        .add(get(m - 1, i - 1, j + 1).multiply(2 * j + 2))
        .add(get(m - 1, i - 1, j).multiply(m - 1 - 2 * i - 2 * j + 2));
    }
  }

  protected int j() {
    return 5;
  }

  @Override
  public Z next() {
    return get(2 * ++mN + 1, 0, j());
  }
}
