package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068350 Numbers n such that n*tau(n) &gt; prime(2*n) where tau(n) = A000005(n).
 * @author Sean A. Irvine
 */
public class A068350 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      super.next();
      final Z p = super.next();
      if (Functions.SIGMA0.z(++mN).multiply(mN).compareTo(p) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
