package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036301.
 * @author Sean A. Irvine
 */
public class A076165 extends AbstractSequence {

  private long mN = 0;
  private final int mDiff;

  protected A076165(final int offset, final int diff) {
    super(offset);
    mDiff = diff;
  }

  /** Construct the sequence. */
  public A076165() {
    this(1, 0);
  }

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      long e = 0;
      long o = 0;
      while (m != 0) {
        final long r = m % 10;
        if ((m & 1) == 0) {
          e += r * r * r;
        } else {
          o += r * r * r;
        }
        m /= 10;
      }
      if (Math.abs(e - o) == mDiff) {
        return Z.valueOf(mN);
      }
    }
  }
}

