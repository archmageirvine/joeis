package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A048884 Numbers k such that sigma(k) - k = k - pi(k) - 1 where pi(k) is A000720.
 * @author Sean A. Irvine
 */
public class A048884 extends A000720 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().add(Functions.SIGMA1.z(++mN)).subtract(2 * mN - 1).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

