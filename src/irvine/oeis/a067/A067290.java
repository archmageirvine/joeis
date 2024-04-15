package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067290 Numbers n such that prime(n)&lt;n*tau(n) where tau(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A067290 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(Functions.SIGMA0.z(++mN).multiply(mN)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
