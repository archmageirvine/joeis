package irvine.oeis.a019;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019510 <code>a(n) =</code> gcd( binomial(n+3, <code>n) +</code> binomial(n+4, <code>n+1),</code> binomial(n+5, <code>n+2) )</code>.
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
