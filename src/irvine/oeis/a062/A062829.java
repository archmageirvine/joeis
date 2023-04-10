package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;
import irvine.util.array.LongDynamicArray;

/**
 * A062829 Smallest triangular numbers that contain the digits of n anywhere in their middle.
 * @author Sean A. Irvine
 */
public class A062829 extends A000217 {

  // This constraint can be made larger if you have lots of memory
  private static final int MAX_BIT_LENGTH = 32;
  private static final long MAX = 1L << MAX_BIT_LENGTH;
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mN = -1;
  {
    mFirsts.set(0, super.next()); // deal with 0
  }

  private void augment(final Z sq, final Z s) {
    if (s.bitLength() < MAX_BIT_LENGTH) {
      final long key = s.longValue();
      if (mFirsts.get(key) == null) {
        mFirsts.set(key, sq);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= MAX) {
      throw new UnsupportedOperationException();
    }
    while (mFirsts.get(mN) == null) {
      final Z sq = super.next();
      augment(sq, sq);
      final String str = sq.toString();
      for (int k = 1; 2 * k < str.length(); ++k) {
        if (str.charAt(k) != '0') {
          for (int j = str.length() / 2 + 1; j < str.length(); ++j) {
            final Z s = new Z(str.substring(k, j));
            augment(sq, s);
          }
        }
      }
    }
    return mFirsts.get(mN);
  }
}
