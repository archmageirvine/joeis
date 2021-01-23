package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033556 a(n+1) = 2a(n) - {largest prime &lt; a(n)}.
 * @author Sean A. Irvine
 */
public class A033556 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply2().subtract(mPrime.prevPrime(mA));
    return mA;
  }
}
