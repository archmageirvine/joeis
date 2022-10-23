package irvine.oeis.a057;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057815 a(n) = gcd(n,binomial(n,floor(n/2))).
 * @author Sean A. Irvine
 */
public class A057815 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2).gcd(Z.valueOf(mN));
  }
}
