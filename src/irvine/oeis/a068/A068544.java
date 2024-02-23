package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068544 Numbers n such that n*tau(n) &gt; 2*prime(n).
 * @author Sean A. Irvine
 */
public class A068544 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma0().multiply(mN).compareTo(super.next().multiply2()) > 0) {
        return mN;
      }
    }
  }
}
