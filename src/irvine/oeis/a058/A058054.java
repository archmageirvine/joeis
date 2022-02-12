package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A058054 Smallest prime &gt; n! minus largest prime &lt;= n!.
 * @author Sean A. Irvine
 */
public class A058054 extends A000142 {

  {
    super.next();
    super.next();
  }
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = super.next();
    return mPrime.nextPrime(f).subtract(mPrime.prevPrime(f.add(1)));
  }
}
