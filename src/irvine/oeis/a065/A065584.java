package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A065584 Smallest prime beginning with exactly n 1's.
 * @author Sean A. Irvine
 */
public class A065584 extends Sequence0 {

  private final char mDigit;
  private int mN = -1;

  protected A065584(final long digit) {
    mDigit = (char) ('0' + digit);
  }

  /** Construct the sequence. */
  public A065584() {
    this(1);
  }

  @Override
  public Z next() {
    final String s = StringUtils.rep(mDigit, ++mN);
    if (!s.isEmpty()) {
      final Z t0 = new Z(s);
      if (t0.isProbablePrime()) {
        return t0;
      }
    }
    long k = 10;
    long lim = 20;
    while (true) {
      if (++k == lim) {
        // Contortions to handle leading 0s
        k *= 5;
        lim *= 10;
      }
      final String v = String.valueOf(k).substring(1);
      if (v.charAt(0) != mDigit) {
        final Z t = new Z(s + v);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
  }
}
