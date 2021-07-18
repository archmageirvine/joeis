package irvine.oeis.a049;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049077 a(n) = n / gcd(n, binomial(n, floor(n/2))).
 * @author Sean A. Irvine
 */
public class A049077 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN / Z.valueOf(mN).gcd(Binomial.binomial(mN, mN / 2)).longValue());
  }
}
