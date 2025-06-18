package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A384661 Solution of the complementary equation b(n)=a(a(n))+a(n)+2 with a(1)=1; this is the sequence a(n).
 * @author Sean A. Irvine
 */
public class A384661 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final long mAdd;
  private long mAPos = 0;
  private long mBPos = 0;
  private long mK = 1;
  private long mN = 1;

  protected A384661(final long additiveTerm) {
    mAdd = additiveTerm;
  }

  /** Construct the sequence. */
  public A384661() {
    this(2);
  }

  @Override
  public Z next() {
    if (mAPos <= 0) {
      mA.set(++mAPos, 1L);
      return Z.ONE;
    }
    if (mN == mAPos) {
      final long t = mA.get(++mBPos);
      final long b = mA.get(t) + t + mAdd;
      while (++mK < b) {
        mA.set(++mAPos, mK);
      }
    }
    return Z.valueOf(mA.get(++mN));
  }
}

