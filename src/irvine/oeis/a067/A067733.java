package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067733 Numbers k such that phi(prime(k)-1) == 0 (mod k).
 * @author Sean A. Irvine
 */
public class A067733 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(super.next().subtract(1)).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
