package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078188 a(1) = 1; for n &gt; 1 take the digits of a(n-1) one after the other and remove one occurrence of this digit from the digits of m = k*n (k &gt; 0) if possible; a(n) is the smallest multiple m of n which has the least number of remaining digits (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A078188 extends Sequence1 {

  private Z mA = null;
  private long mN = 0;

  private int len(String s, final String d) {
    for (int k = 0; k < d.length(); ++k) {
      s = s.replaceFirst(d.substring(k, k + 1), "");
    }
    return s.length();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mA = Z.ONE;
    } else {
      final String prev = mA.toString();
      long k = 0;
      int best = Integer.MAX_VALUE;
      long res = 0;
      while (true) {
        final long v = ++k * mN;
        final String s = String.valueOf(v);
        final int len = len(s, prev);
        if (len < best) {
          best = len;
          res = v;
        }
        if (s.length() > prev.length() + best - 1) {
          mA = Z.valueOf(res);
          break;
        }
      }
    }
    return mA;
  }
}

