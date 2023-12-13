package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025560 a(n) = LCM{1, C(n-1,1), C(n-2,2), ..., C(n-[ n/2 ],[ n/2 ])}.
 * @author Sean A. Irvine
 */
public class A025560 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 0; k <= mN / 2; ++k) {
      lcm = lcm.lcm(Binomial.binomial(mN - k, k));
    }
    return lcm;
  }
}
