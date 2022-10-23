package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053024 a(n) = n*p where p is the next prime &gt;= n.
 * @author Sean A. Irvine
 */
public class A053024 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.nextPrime(mN)).multiply(++mN);
  }
}
