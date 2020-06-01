package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005867 <code>a(0) = 1;</code> for <code>n &gt; 0, a(n) = (prime(n)-1)*a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A005867 implements Sequence {

  private Z mA = Z.ONE;
  private long mP = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (mP == 0) {
      mP = 1;
    } else {
      mP = mPrime.nextPrime(mP);
      mA = mA.multiply(mP - 1);
    }
    return mA;
  }
}
