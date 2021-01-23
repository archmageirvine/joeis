package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A030378 Least k such that base 4 representation of n begins at s(k), where s=A030373.
 * @author Sean A. Irvine
 */
public class A030378 implements Sequence {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mM;
  private long mN = first();
  private long mLim = 4;
  private long mLen = 1;
  private final Sequence mUnder;

  protected A030378(final Sequence under, final long start) {
    mUnder = under;
    mM = start;
  }

  /** Construct the sequence. */
  public A030378() {
    this(new A030373(), 0);
  }

  protected long first() {
    return 0;
  }

  private int get(final long n) {
    while (n > mM) {
      mA.set(++mM, mUnder.next().intValue());
    }
    return mA.get(n);
  }

  private boolean isMatch(long n, final long pos, final long len) {
    for (long k = len - 1; k >= 0; --k) {
      if (get(pos + k) != (n & 3)) {
        return false;
      }
      n >>>= 2;
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN == mLim) {
      ++mLen;
      mLim *= 4;
    }
    long k = first();
    while (true) {
      if (isMatch(mN, ++k, mLen)) {
        return Z.valueOf(k);
      }
    }
  }
}

