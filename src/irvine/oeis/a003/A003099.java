package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003099 <code>a(n) =</code> Sum_{k=0..n} binomial(n,k^2).
 * @author Sean A. Irvine
 */
public class A003099 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k <= LongUtils.sqrt(mN); ++k) {
      s = s.add(Binomial.binomial(mN, k * k));
    }
    return s;
  }
}
