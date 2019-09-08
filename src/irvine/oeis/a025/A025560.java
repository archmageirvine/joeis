package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025560 <code>a(n) = LCM{1, C(n-1,1), C(n-2,2)</code>, ..., <code>C(n-[ n/2 ],[ n/2 ])}</code>.
 * @author Sean A. Irvine
 */
public class A025560 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    for (long k = 0; k <= mN / 2; ++k) {
      l = l.lcm(Binomial.binomial(mN - k, k));
    }
    return l;
  }
}
