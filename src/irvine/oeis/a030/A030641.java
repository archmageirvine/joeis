package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030641 <code>a(1) = 6</code>; for <code>n &gt; 1, a(n) =</code> product of next 2 primes after <code>a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A030641 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SIX;
    } else {
      final Z t = mPrime.nextPrime(mA);
      mA = t.multiply(mPrime.nextPrime(t));
    }
    return mA;
  }
}
