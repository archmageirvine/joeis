package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045745 Numbers n such that sum of proper divisors s(n) is a triangular number T(k).
 * @author Sean A. Irvine
 */
public class A045745 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).subtract(mN).multiply(8).add(1).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
