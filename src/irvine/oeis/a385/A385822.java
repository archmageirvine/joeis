package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385822 Numbers k such that phi(k) is not a perfect square.
 * @author Sean A. Irvine
 */
public class A385822 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (!Functions.PHI.z(++mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
