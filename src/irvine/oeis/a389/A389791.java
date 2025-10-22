package irvine.oeis.a389;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389791 allocated for Tamas Sandor Nagy.
 * @author Sean A. Irvine
 */
public class A389791 extends Sequence1 {

  // After Michael S. Branicky

  private final Fast mPrime = new Fast();
  private long mQ = 11;
  private long mA = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
      return Z.ONE;
    }
    long p = mQ;
    mQ = mPrime.nextPrime(mQ);
    final String s = String.valueOf(mA);
    final String sp = String.valueOf(p);
    final String sq = String.valueOf(mQ);
    mA = 0;
    while (true) {
      if (!mPrime.isPrime(++mA)) {
        final String u = String.valueOf(mA);
        if (!(s + u).contains(sp)) {
          continue;
        }
        for (int i = 0; i < s.length(); ++i) {
          for (int j = 1; j <= u.length(); ++j) {
            for (int k = 0; k < u.length(); ++k) {
              if ((s.substring(i) + u.substring(0, j)).equals(sp) && sq.startsWith(u.substring(k)) && sq.charAt(u.length() - k) != '0') {
                return Z.valueOf(mA);
              }
            }
          }
        }
      }
    }
  }
}
