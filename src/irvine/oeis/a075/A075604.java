package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A075604.
 * @author Sean A. Irvine
 */
public class A075604 implements Sequence {

  private final Sequence mA075603 = new A075603();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // Examine cached terms
    for (long k = 0; k < mA.length(); ++k) {
      if (mA.get(k) == mN) {
        return Z.valueOf(k + 11);
      }
    }
    // Extend cache until we find it
    while (true) {
      final long c = mA075603.next().longValue();
      final long p = mA.length();
      mA.set(p, c);
      if (c == mN) {
        return Z.valueOf(p + 11);
      }
    }
  }
}

