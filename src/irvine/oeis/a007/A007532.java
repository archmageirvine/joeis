package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007532 Handsome numbers: sum of positive powers of its digits; <code>a(n) = Sum_{i=1..k} d[i]^e[i]</code> where <code>d[1..k]</code> are the decimal digits of <code>a(n), e[i] &gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A007532 implements Sequence {

  private long mN = 0;

  private boolean isPowerful(final long n, final String s, final int pos) {
    assert n >= 0;
    if (pos == s.length()) {
      return n == 0;
    }
    final long v = s.charAt(pos) - '0';
    if (v <= 1) {
      return isPowerful(n - v, s, pos + 1);
    }
    long u = v;
    while (u <= n) {
      if (isPowerful(n - u, s, pos + 1)) {
        return true;
      }
      u *= v;
    }
    return false;
  }

  private boolean isPowerful(final long n) {
    return isPowerful(n, String.valueOf(n), 0);
  }

  @Override
  public Z next() {
    while (true) {
      if (isPowerful(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
