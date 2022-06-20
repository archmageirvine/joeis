package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057602 a(1)=2, a(n+1) is the smallest integer &gt; a(n) such that the smallest prime factor of a(n+1) is the largest prime factor of a(n).
 * @author Sean A. Irvine
 */
public class A057602 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final Z lpf = Jaguar.factor(mA).largestPrimeFactor();
      final Z t = lpf.square();
      if (t.compareTo(mA) > 0) {
        mA = t;
      } else {
        mA = lpf.multiply(mPrime.nextPrime(lpf));
      }
    }
    return mA;
  }
}
