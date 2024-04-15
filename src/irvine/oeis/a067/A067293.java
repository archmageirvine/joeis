package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067293 Numbers k such that prime(k+1)-(k+1)*tau(k+1) = prime(k)-k*tau(k) where tau(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A067293 extends A000040 {

  private long mN = 1;
  private Z mA = super.next().subtract(1);

  @Override
  public Z next() {
    while (true) {
      final Z a = mA;
      mA = super.next().subtract(Functions.SIGMA0.z(++mN).multiply(mN));
      if (a.equals(mA)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
