package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A049613 a(n) = 2n - (largest prime &lt; 2n-2).
 * @author Sean A. Irvine
 */
public class A049613 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 4;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN - mPrime.prevPrime(mN - 2));
  }
}
