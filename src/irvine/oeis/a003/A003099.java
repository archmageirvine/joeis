package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003099 a(n) = Sum_{k=0..n} binomial(n,k^2).
 * @author Sean A. Irvine
 */
public class A003099 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k <= Functions.SQRT.l(mN); ++k) {
      s = s.add(Binomial.binomial(mN, k * k));
    }
    return s;
  }
}
