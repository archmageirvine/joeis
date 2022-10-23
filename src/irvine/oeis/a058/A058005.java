package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058005 a(n) = gcd(2*n, binomial(2*n, n)).
 * @author Sean A. Irvine
 */
public class A058005 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2L * ++mN, mN).gcd(Z.valueOf(2L * mN));
  }
}
