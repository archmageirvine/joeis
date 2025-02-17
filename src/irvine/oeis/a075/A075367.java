package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075367 extends A075365 {

  @Override
  public Z next() {
    final int k = super.next().intValueExact();
    Z lcm = Z.ONE;
    for (int j = 1; j <= k; ++j) {
      lcm = lcm.lcm(mN + j);
    }
    return lcm;
  }
}
