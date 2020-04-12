package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A031044 <code>a(n)=least</code> k such that base 8 representation of n begins at <code>s(k)</code>, where <code>s=A031035</code>.
 * @author Sean A. Irvine
 */
public class A031044 implements Sequence {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mM;
  private long mN = first();
  private long mLim = 8;
  private long mLen = 1;
  private final Sequence mUnder;

  protected A031044(final Sequence under, final long start) {
    mUnder = under;
    mM = start;
  }

  /** Construct the sequence. */
  public A031044() {
    this(new A031035(), 0);
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
      if (get(pos + k) != (n & 7)) {
        return false;
      }
      n >>>= 3;
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
      mLim <<= 3;
    }
    long k = first();
    while (true) {
      if (isMatch(mN, ++k, mLen)) {
        return Z.valueOf(k);
      }
    }
  }
}

