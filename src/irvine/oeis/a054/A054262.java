package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A054262 Start with the prime 11; next prime must exceed previous prime and start with last digit of previous prime.
 * @author Sean A. Irvine
 */
public class A054262 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(11);
      return mA;
    } else {
      // Some smarts to make search faster
      final long r = mA.mod(10);
      final String prefix = String.valueOf(r);
      while (true) {
        final String a = mA.toString();
        final long s = a.charAt(0) - '0';
        if (r != s) {
          mA = new Z(prefix + StringUtils.rep('0', r > s ? a.length() - 1 : a.length())).subtract(1);
        }
        mA = mPrime.nextPrime(mA);
        final String u = mA.toString();
        if (u.startsWith(prefix)) {
          return mA;
        }
      }
    }
  }
}
