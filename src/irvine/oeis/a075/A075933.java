package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A075933 Positions of check bits in code in A075931.
 * @author Sean A. Irvine
 */
public class A075933 extends Sequence0 {

  // After Bob Jenkins
  // cf. http://burtleburtle.net/bob/c/ecc.c

  private int mN = -1;
  private long mM = -1;
  private final int mDistance;
  private final DynamicLongArray mWords = new DynamicLongArray();
  private long mPrev = 0;
  private long mPrevCnt = 1;

  protected A075933(final int distance) {
    mDistance = distance;
  }

  /** Construct the sequence. */
  public A075933() {
    this(5);
  }

  private boolean test(final int len, long t, final int pos, final int num, final int cnt) {
    if (num != 0) {
      for (int i = pos; i < len; ++i) {
        t ^= mWords.get(i);
        if (!test(len, t, i + 1, num - 1, cnt)) {
          return false;
        }
        t ^= mWords.get(i);
      }
    } else {
      for (int i = pos; i < len; ++i) {
        t ^= mWords.get(i);
        if (1 + cnt + Long.bitCount(mWords.get(len) ^ t) < mDistance) {
          mPrev = t;
          mPrevCnt = 1 + cnt;
          return false;
        }
        t ^= mWords.get(i);
      }
    }
    return true;
  }

  private boolean isOkay() {
    for (int k = 0; k < mDistance - 2; ++k) {
      if (!test(mN, 0, 0, k, k + 1)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mPrevCnt + Long.bitCount(++mM ^ mPrev) < mDistance) {
        continue;
      }
      if (1 + Long.bitCount(mM) < mDistance) {
        mPrev = 0;
        mPrevCnt = 1;
        continue;
      }
      mWords.set(mN, mM);
      if (isOkay()) {
        return Z.valueOf(mM);
      }
    }
  }
}
