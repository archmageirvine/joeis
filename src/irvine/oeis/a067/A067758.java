package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067758 Numbers k such that sigma(prime(k) - 1) == 0 (mod k).
 * @author Sean A. Irvine
 */
public class A067758 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(super.next().subtract(1)).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
