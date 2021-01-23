package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A030555 a(n)=least k such that base 6 representation of n begins at s(k), where s=A030548.
 * @author Sean A. Irvine
 */
public class A030555 implements Sequence {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mM;
  private long mN = first();
  private long mLim = 6;
  private long mLen = 1;
  private final Sequence mUnder;

  protected A030555(final Sequence under, final long start) {
    mUnder = under;
    mM = start;
  }

  /** Construct the sequence. */
  public A030555() {
    this(new A030548(), 0);
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
      if (get(pos + k) != (n % 6)) {
        return false;
      }
      n /= 6;
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
      mLim *= 6;
    }
    long k = first();
    while (true) {
      if (isMatch(mN, ++k, mLen)) {
        return Z.valueOf(k);
      }
    }
  }
}

