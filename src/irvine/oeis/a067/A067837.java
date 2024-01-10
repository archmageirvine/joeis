package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067837 a(1)=2; to form a(n+1), append P, the largest prime &lt; a(n), if any and Q, the smallest prime &gt; a(n), at the beginning and the end of a(n), respectively.
 * @author Sean A. Irvine
 */
public class A067837 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else if (mA.equals(Z.TWO)) {
      mA = Z.valueOf(23);
    } else {
      mA = new Z(mPrime.prevPrime(mA) + mA.toString() + mPrime.nextPrime(mA));
    }
    return mA;
  }
}
