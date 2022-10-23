package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A007767 Number of pairs of permutations of degree n that avoid (12,21).
 * @author Evegeny Kapun
 * @author Sean A. Irvine
 */
public class A007767 extends Sequence0 {

  // Made incremental and higher precision by Sean A. Irvine

  private int mN = -1;
  private int[] mPermutation;
  private LongDynamicLongArray mCurrentAnswer;
  private LongDynamicLongArray mNextAnswer;

  private Z solve(final int pos, final long mask) {
    if (pos == mN) {
      Z res = Z.ZERO;
      int min = mN;
      for (int i = 0; i < mN; ++i) {
        if (mPermutation[i] > min) {
          continue;
        }
        long key = 0;
        long cmask = 0;
        long mul = 1;
        for (int j = 0, jj = 0; j < mN; ++j) {
          if (j == i) {
            continue;
          }
          final int p = mPermutation[j];
          key += Long.bitCount(cmask & ((1L << p) - 1)) * mul;
          mul *= ++jj;
          cmask |= 1L << p;
        }
        res = res.add(mCurrentAnswer.get(key));
        min = mPermutation[i];
      }
      long key = 0;
      long cmask = 0;
      long mul = 1;
      for (int j = 0; j < mN;) {
        final int p = mPermutation[j];
        key += Long.bitCount(cmask & ((1L << p) - 1)) * mul;
        mul *= ++j;
        cmask |= 1L << p;
      }
      mNextAnswer.set(key, res.longValueExact()); // will throw exception if overflows
      return res;
    }
    Z res = Z.ZERO;
    long cmask = mask;
    for (int i = Long.numberOfTrailingZeros(~mask); i < mN; cmask |= 1L << i, i = Long.numberOfTrailingZeros(~cmask)) {
      mPermutation[pos] = i;
      res = res.add(solve(pos + 1, mask | (1L << i)));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mCurrentAnswer = new LongDynamicLongArray();
      mCurrentAnswer.set(0, 1L);
      return Z.ONE;
    }
    mNextAnswer = new LongDynamicLongArray();
    mPermutation = new int[mN];
    final Z res = solve(0, 0);
    mCurrentAnswer = mNextAnswer;
    return res;
  }
}
