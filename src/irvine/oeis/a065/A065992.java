package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065992 Numbers k such that the sum of the nonsquare numbers from 1 to k is a square.
 * @author Sean A. Irvine
 */
public class A065992 extends Sequence1 {

  private long mN = 1; // You could easily argue that 1 should be in this sequence

  @Override
  public Z next() {
    while (true) {
      final long m = Functions.SQRT.l(++mN);
      final Z n = Z.valueOf(mN);
      if (n.multiply(mN + 1).divide2().subtract(Z.valueOf(m * (m + 1)).multiply(2 * m + 1).divide(6)).isSquare()) {
        return n;
      }
    }
  }
}
