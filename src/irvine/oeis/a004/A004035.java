package irvine.oeis.a004;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004035 The coding-theoretic function A(n,4,5).
 * @author Sean A. Irvine
 */
public class A004035 extends AbstractSequence {

  private static final int MAX = 1000000;
  private int mN;
  private final int mD;
  private final int mW;
  private long mLimit = 0;
  private long mBest = 0;
  private final long[] mWords = new long[MAX];

  /** Construct the sequence. */
  public A004035() {
    this(4, 4, 5);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param d first parameter
   * @param w second parameter
   */
  public A004035(final int offset, final int d, final int w) {
    super(offset);
    mD = d;
    mW = w;
    mN = offset - 1;
  }

  private boolean isHammingOk(final long word, final int d, final int pos) {
    for (int k = pos - 1; k >= 0; --k) {
      if (Long.bitCount(mWords[k] ^ word) < d) {
        return false;
      }
    }
    return true;
  }

  private void search(final long word, final int d, final int w, final int pos) {
    if (pos > mBest) {
      mBest = pos;
    }
    final long max = Math.min(mLimit, word << w);
    for (long k = LongUtils.swizzle(word); k < max; k = LongUtils.swizzle(k)) {
      if (isHammingOk(k, d, pos)) {
        mWords[pos] = k;
        search(k, d, w, pos + 1);
      }
    }
  }

  protected long a(final int n, final int d, final int w) {
    mBest = 0;
    mLimit = 1L << n;
    final long max = Math.min(mLimit, 1L << w); // WLOG can assume first word has at least one 1 in first w bits
    for (long k = (1L << w) - 1; k < max; k = LongUtils.swizzle(k)) {
      if ((k & 1) == 1) { // WLOG can assume first code word has the lowest bit set
        mWords[0] = k;
        search(k, d, w, 1);
      }
    }
    return mBest;
  }

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, mD, mW));
  }
}
