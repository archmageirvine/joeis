package irvine.oeis.a019;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019510 <code>a(n) = gcd( binomial(n+3, n) + binomial(n+4, n+1), binomial(n+5, n+2) )</code>.
 * @author Sean A. Irvine
 */
public class A019510 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 3, mN).add(Binomial.binomial(mN + 4, mN + 1)).gcd(Binomial.binomial(mN + 5, mN + 2));
  }
}
