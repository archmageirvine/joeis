package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048549 a(n+1) is next smallest prime beginning with a(n), initial prime is 2.
 * @author Sean A. Irvine
 */
public class A048549 extends AbstractSequence {

  private String mPrefix = null;
  private final String mStart;
  private final int mBase;

  protected A048549(final String start, final int base) {
    super(1);
    mStart = start;
    mBase = base;
  }

  protected A048549(final String start) {
    this(start, 10);
  }

  /** Construct the sequence. */
  public A048549() {
    this("2");
  }

  private Z makeNumber(final String prefix, final StringBuilder zeros, final long m) {
    final String t = zeros.toString() + Long.toString(m, mBase);
    return new Z(prefix + t.substring(t.length() - zeros.length() - 1), mBase);
  }

  @Override
  public Z next() {
    if (mPrefix == null) {
      mPrefix = mStart;
    } else {
      // Complicated by the possibility of leading zeros in the suffix
      final StringBuilder zeros = new StringBuilder();
      long lim = mBase;
      long m = 1;
      Z t;
      while (!(t = makeNumber(mPrefix, zeros, m)).isProbablePrime()) {
        m += 2;
        if (m > lim) {
          lim *= mBase;
          m = 1;
          zeros.append('0');
        }
      }
      mPrefix = t.toString(mBase);
    }
    return new Z(mPrefix, mBase);
  }
}
