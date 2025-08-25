package irvine.oeis.a079;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A079687 (C(p^2,p)-p)/p^5 where p runs through the primes &gt;= 5.
 * @author Sean A. Irvine
 */
public class A079687 extends Sequence1 {

  private final Sequence mPrimes = new A000040().skip(2);

  @Override
  public Z next() {
    final Z p = mPrimes.next();
    return Binomial.binomial(p.square(), p).subtract(p).divide(p.pow(5));
  }
}

