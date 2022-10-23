package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033558 a(n) = 2n - {smallest prime &gt; n}.
 * @author Sean A. Irvine
 */
public class A033558 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - mPrime.nextPrime(mN));
  }
}
