package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068192 Let a(1)=2, f(n) = 4*a(1)*a(2)*...*a(n-1) for n &gt;= 1 and a(n) = f(n)-prevprime(f(n)-1) for n &gt;= 2, where prevprime(x) is the largest prime &lt; x.
 * @author Sean A. Irvine
 */
public class A068192 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.EIGHT;
      return Z.TWO;
    }
    final Z t = mA.subtract(mPrime.prevPrime(mA.subtract(1)));
    mA = mA.multiply(t);
    return t;
  }
}
