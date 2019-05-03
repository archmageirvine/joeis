package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A000201 Lower Wythoff sequence <code>(a</code> Beatty <code>sequence): a(n) = floor(n*phi)</code>, where phi <code>= (1+sqrt(5))/2 = A001622</code>.
 * @author Sean A. Irvine
 */
public class A000201 implements Sequence {

  private final DynamicLongArray mSeen = new DynamicLongArray();
  protected long mN = 0;
  private long mPrev = 0;

  private void seen(final long v) {
    final long bit = 1L << (v & 63);
    final int index = (int) (v >>> 6);
    final long c = mSeen.get(index);
    mSeen.set(index, c | bit);
  }

  private long add(final long v) {
    final long bit = 1L << (v & 63);
    final int index = (int) (v >>> 6);
    final long c = mSeen.get(index);
    return (c & bit) == 0 ? 1 : 2;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mPrev = 1;
      seen(mPrev);
    } else {
      mPrev = mPrev + add(mN - 1);
      seen(mPrev);
    }
    return Z.valueOf(mPrev);
  }
}
