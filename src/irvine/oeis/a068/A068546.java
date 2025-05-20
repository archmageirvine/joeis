package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068546 Numbers k such that k*tau(k)&gt;4*prime(k).
 * @author Sean A. Irvine
 */
public class A068546 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA0.z(mN).multiply(mN).compareTo(super.next().multiply(4)) > 0) {
        return mN;
      }
    }
  }
}
