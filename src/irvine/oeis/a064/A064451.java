package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a102.A102715;

/**
 * A064451 LCM of totients of binomial coefficients C(n,j), j = 0..n.
 * @author Sean A. Irvine
 */
public class A064451 extends A102715 {

  private long mN = 0;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      lcm = lcm.lcm(super.next());
    }
    return lcm;
  }
}
