package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061448 a(1) = 2; a(n+1) = smallest prime &gt; a(n) with leading digit equal to final digit of a(n).
 * @author Sean A. Irvine
 */
public class A061448 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mMul = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final String s = mA.toString();
      final long r = mA.mod(10);
      Z t;
      if (s.charAt(0) <= s.charAt(s.length() - 1)) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
          t = mA;
        } else {
          t = mMul.multiply(r);
        }
      } else {
        mMul = mMul.multiply(10);
        t = mMul.multiply(r);
      }
      while (true) {
        final Z u = mPrime.nextPrime(t);
        final String v = u.toString();
        if (v.charAt(0) == s.charAt(s.length() - 1)) {
          mA = u;
          return mA;
        }
        mMul = mMul.multiply(10);
        t = t.multiply(10);
      }
    }
    return mA;
  }
}
