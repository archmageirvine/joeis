package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066684 Numbers k such that prime(k) is congruent to sigma(k) (mod k), where prime(n) denotes the n-th prime.
 * @author Sean A. Irvine
 */
public class A066684 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == Functions.SIGMA1.z(mN).mod(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
