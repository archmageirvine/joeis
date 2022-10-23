package irvine.oeis.a019;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019510 a(n) = gcd( binomial(n+3, n) + binomial(n+4, n+1), binomial(n+5, n+2) ).
 * @author Sean A. Irvine
 */
public class A019510 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 3, mN).add(Binomial.binomial(mN + 4, mN + 1)).gcd(Binomial.binomial(mN + 5, mN + 2));
  }
}
