package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A062179 Harmonic mean of digits is an integer.
 * @author Georg Fischer
 */
public class A062179 implements Sequence {

  private long mN = 0;

  /**
   * Compute the harmonic mean of the digits of n
   * @param n consider the digits of this number
   * @return harmonic mean (a rational)
   */
  public static Q harmonicMean(final long n) {
    final String sn = String.valueOf(n);
    if (sn.indexOf('0') >= 0) { //contains zero
      return new Q(1, 2); // not an integer
    }
    final int len = sn.length();
    Q sum = Q.ZERO;
    for (int pos = 0; pos < len; ++pos) {
      sum = sum.add(new Q(1, sn.charAt(pos) - '0'));
    }
    return new Q(len).divide(sum);
  }

  @Override
  public Z next() {
    while (!harmonicMean(++mN).isInteger()) {
    }
    return Z.valueOf(mN);
  }
}
