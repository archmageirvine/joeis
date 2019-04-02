package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A000018 Number of positive integers &lt;= 2^n of form x^2 + 16y^2.
 * @author Sean A. Irvine
 */
public class A000018 implements Sequence {

  private int mN = -1;
  private final long mA, mB;

  A000018(final long a, final long b) {
    mA = a;
    mB = b;
  }

  A000018(final long a) {
    this(a, 1);
  }

  /** Construct the sequence. */
  public A000018() {
    this(16);
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    final long lim = 1L << mN;
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    long y = 0;
    while (true) {
      final long ys = mA * y * y;
      if (ys > lim) {
        break;
      }
      long x = 0;
      while (true) {
        final long v = ys + mB * x * x;
        if (v > lim) {
          break;
        }
        seen.set(v);
        ++x;
      }
      ++y;
    }
    return Z.valueOf(seen.popcount() - 1); // -1, don't count 0 as a solution
  }
}

