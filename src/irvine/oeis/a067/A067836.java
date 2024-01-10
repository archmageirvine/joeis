package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067836 Let a(1)=2, f(n)=a(1)*a(2)*...*a(n-1) for n&gt;=1 and a(n)=nextprime(f(n)+1)-f(n) for n&gt;=2, where nextprime(x) is the smallest prime &gt; x.
 * @author Sean A. Irvine
 */
public class A067836 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    } else {
      final Z t = mPrime.nextPrime(mA.add(1)).subtract(mA);
      mA = mA.multiply(t);
      return t;
    }
  }
}
