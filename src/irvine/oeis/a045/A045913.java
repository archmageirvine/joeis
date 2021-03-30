package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045913 Kaprekar numbers: numbers k such that k = q + r and k^2 = q*10^m + r, for some m &gt;= 1, q &gt;= 0 and 0 &lt;= r &lt; 10^m. Here q and r must both have the same number of digits.
 * @author Sean A. Irvine
 */
public class A045913 implements Sequence {

  private long mN = 0;
  private long mSkip = 10;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (++mN == mSkip) {
        mSkip *= 10;
        continue;
      }
      final Z n = Z.valueOf(mN);
      final String s = n.square().toString();
      final int t = s.length() / 2;
      if ((s.length() & 1) == 0) {
        if (s.charAt(t) != '0' && Long.parseLong(s.substring(0, t)) + Long.parseLong(s.substring(t)) == mN) {
          return n;
        }
      } else {
        // Case of odd length where middle digit is 0
        if (s.charAt(t) == '0' && s.charAt(t + 1) != 0 && Long.parseLong(s.substring(0, t)) + Long.parseLong(s.substring(t + 1)) == mN) {
          return n;
        }
      }
    }
  }
}
