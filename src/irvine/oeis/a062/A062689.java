package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;
import irvine.util.array.LongDynamicArray;

/**
 * A062686.
 * @author Sean A. Irvine
 */
public class A062689 extends A000290 {

  // This constraint can be made larger if you have lots of memory
  private static final int MAX_BIT_LENGTH = 32;
  private static final long MAX = 1L << MAX_BIT_LENGTH;
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mN = -1;
  {
    mFirsts.set(0, super.next()); // deal with 0
  }

  @Override
  public Z next() {
    if (++mN >= MAX) {
      throw new UnsupportedOperationException();
    }
    while (mFirsts.get(mN) == null) {
      final Z sq = super.next();
      final String str = sq.toString();
      for (int k = 0; 2 * k < str.length(); ++k) {
        if (str.charAt(k) != '0') {
          final Z s = new Z(str.substring(k, str.length() - k));
          if (s.bitLength() < MAX_BIT_LENGTH) {
            final long key = s.longValue();
            if (mFirsts.get(key) == null) {
              mFirsts.set(key, sq);
            }
          }
        }
      }
    }
    return mFirsts.get(mN);
  }
}
