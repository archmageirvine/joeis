package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003137;
import irvine.util.array.LongDynamicIntArray;

/**
 * A030335 a(n)=least k such that base 3 representation of n begins as s(k), where s=A003137.
 * @author Sean A. Irvine
 */
public class A030335 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mM;
  private long mN = first();
  private long mLim = 3;
  private long mLen = 1;
  private final Sequence mUnder;

  protected A030335(final Sequence under, final long start) {
    mUnder = under;
    mM = start;
  }

  /** Construct the sequence. */
  public A030335() {
    this(new A003137(), 0);
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
      if (get(pos + k) != n % 3) {
        return false;
      }
      n /= 3;
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
      mLim *= 3;
    }
    long k = first();
    while (true) {
      if (isMatch(mN, ++k, mLen)) {
        return Z.valueOf(k);
      }
    }
  }
}

