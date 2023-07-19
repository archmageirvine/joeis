package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a022.A022559;

/**
 * A064612 Partial sum of bigomega is divisible by n, where bigomega(n)=A001222(n) and summatory-bigomega(n)=A022559(n).
 * @author Sean A. Irvine
 */
public class A064612 extends A022559 {

  private long mN = 0;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
