package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045746 Numbers whose sum of divisors is a triangular number.
 * @author Sean A. Irvine
 */
public class A045746 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).multiply(8).add(1).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
