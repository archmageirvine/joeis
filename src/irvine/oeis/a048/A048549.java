package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048549 a(n+1) is next smallest prime beginning with a(n), initial prime is 2.
 * @author Sean A. Irvine
 */
public class A048549 implements Sequence {

  private String mPrefix = null;
  private final String mStart;

  protected A048549(final String start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A048549() {
    this("2");
  }

  private Z makeNumber(final String prefix, final StringBuilder zeros, final long m) {
    final String t = zeros.toString() + m;
    return new Z(prefix + t.substring(t.length() - zeros.length() - 1));
  }

  @Override
  public Z next() {
    if (mPrefix == null) {
      mPrefix = mStart;
    } else {
      // Complicated by the possibility of leading zeros in the suffix
      final StringBuilder zeros = new StringBuilder();
      long lim = 10;
      long m = 1;
      Z t;
      while (!(t = makeNumber(mPrefix, zeros, m)).isProbablePrime()) {
        m += 2;
        if (m > lim) {
          lim *= 10;
          m = 1;
          zeros.append('0');
        }
      }
      mPrefix = t.toString();
    }
    return new Z(mPrefix);
  }
}
