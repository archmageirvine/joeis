package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A000074 Number of odd integers &lt;= 2^n of form x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A000074 extends Sequence1 {

  private int mN = 0;
  private final long mA, mB;

  A000074(final long a, final long b) {
    mA = a;
    mB = b;
  }

  A000074(final long a) {
    this(a, 1);
  }

  /** Construct the sequence. */
  public A000074() {
    this(1);
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
        if ((v & 1) == 1) {
          final long w = v >>> 1; // throw away parity, always 1
          seen.set(w);
        }
        ++x;
      }
      ++y;
    }
    return Z.valueOf(seen.popcount());
  }
}

