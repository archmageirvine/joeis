package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A031225 a(n)=least k such that base 5 representation of n begins at s(k), where s=A031219.
 * @author Sean A. Irvine
 */
public class A031225 implements Sequence {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mM;
  private long mN = first();
  private long mLim = 5;
  private long mLen = 1;
  private final Sequence mUnder;

  protected A031225(final Sequence under, final long start) {
    mUnder = under;
    mM = start;
  }

  /** Construct the sequence. */
  public A031225() {
    this(new A031219(), 0);
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
      if (get(pos + k) != n % 5) {
        return false;
      }
      n /= 5;
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
      mLim *= 5;
    }
    long k = first();
    while (true) {
      if (isMatch(mN, ++k, mLen)) {
        return Z.valueOf(k);
      }
    }
  }
}

