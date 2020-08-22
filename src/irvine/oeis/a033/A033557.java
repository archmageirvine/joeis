package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033557 2n - {largest prime &lt; n}.
 * @author Sean A. Irvine
 */
public class A033557 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - mPrime.prevPrime(mN));
  }
}
