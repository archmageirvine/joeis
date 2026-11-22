package irvine.oeis.a159;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A159065 Number of crossings in a regular drawing of the complete bipartite graph K(n,n).
 * @author Gregory Morse
 */
public class A159065 extends Sequence1 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int a = 1; a < mN; ++a) {
      for (int b = 1; b < mN; ++b) {
        if (Functions.GCD.i(a, b) == 1) {
          sum = sum.add((long) (mN - a) * (mN - b));
          if (2 * a < mN && 2 * b < mN) {
            sum = sum.subtract(Z.valueOf((long) (mN - 2 * a) * (mN - 2 * b)));
          }
        }
      }
    }
    return sum;
  }
}
