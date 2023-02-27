package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A061641 Pure numbers in the Collatz (3x+1) iteration. Also called pure hailstone numbers.
 * @author Sean A. Irvine
 */
public class A061641 extends Sequence1 {

  private static final int BITS = 34; // This can be made as high as 63, but you will run out of memory
  private static final long LIMIT = 1L << BITS;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    while (mSeen.isSet(mN)) {
      if (++mN >= LIMIT) {
        throw new UnsupportedOperationException();
      }
    }
    Z m = Z.valueOf(mN);
    do {
      if (m.bitLength() < 34) {
        mSeen.set(m.longValue());
      }
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
    } while (m.compareTo(Z.ONE) > 0);
    return Z.valueOf(mN);
  }
}

