package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072919 a(n) = p(n) - binomial(2n,n), where p(n) is the least prime greater than binomial(2n,n).
 * @author Sean A. Irvine
 */
public class A072919 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final Z b = Binomial.binomial(2 * ++mN, mN);
    return mPrime.nextPrime(b).subtract(b);
  }
}

